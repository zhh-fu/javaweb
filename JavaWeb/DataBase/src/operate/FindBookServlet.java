package operate;

import source.Book;
import source.setConnection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "FindBookServlet", urlPatterns = "/FindBookServlet")
public class FindBookServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Connection connection=new setConnection().getConnection();
        request.setCharacterEncoding("UTF-8");
        try
        {
            String str=request.getParameter("selectBook");
            String sql="SELECT * FROM tb_books WHERE name LIKE '%" + str + "%'";
            Statement statement=connection.createStatement();
            ResultSet resultSet=statement.executeQuery(sql);
            //resultSet.last();
            //int rowCount=resultSet.getRow();
            String bar="<a href='FindServlet?page=1'>"+ "["+ 1 + "]" + "</a>";
            request.setAttribute("bar",bar);
            List<Book> bookList=new ArrayList<Book>();
            while (resultSet.next())
            {
                Book book=new Book();
                book.setId(resultSet.getInt("id"));
                book.setName(resultSet.getString("name"));
                book.setPrice(resultSet.getDouble("price"));
                book.setBookCount(resultSet.getInt("bookCount"));
                book.setAuthor(resultSet.getString("author"));
                bookList.add(book);
            }
            request.setAttribute("consultBook",bookList);
            resultSet.close();
            statement.close();
            connection.close();
        }
        catch (SQLException ex)
        {
            PrintWriter out=response.getWriter();
            out.write("查询失败!");
            ex.printStackTrace();
        }
        request.getRequestDispatcher("book_list.jsp").forward(request,response);
    }
}
