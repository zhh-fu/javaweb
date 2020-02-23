package operate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import source.Book;
import source.setConnection;
@WebServlet(name = "FindServlet", urlPatterns = "/FindServlet")
public class FindServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        setConnection conn=new setConnection();
        Connection connection=conn.getConnection();
        int count=conn.count();
        int currage=Integer.parseInt(request.getParameter("page"));
        int pages=0;
        request.setCharacterEncoding("UTF-8");
        if (count%Book.PAGE==0)
            pages=count/Book.PAGE;
        else
            pages=count/Book.PAGE+1;
        StringBuffer stringBuffer=new StringBuffer();
        for (int i=1;i<=pages;i++) {
            if (i == currage) {
                stringBuffer.append("[" + i + "]");
            }
            else {
                stringBuffer.append("<a href='FindServlet?page=" + i + "'>" + i + "</a>");
            }
            stringBuffer.append("  ");
        }
        request.setAttribute("bar",stringBuffer.toString());
        try
        {
            //String str=request.getParameter("selectBook");
            //String sql="select * from tb_books";
            String sql="select * from tb_books order by id limit ?,?";
            //Statement statement=connection.createStatement();
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setInt(1,(currage-1)*Book.PAGE);
            preparedStatement.setInt(2,Book.PAGE);
            ResultSet resultSet=preparedStatement.executeQuery();
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
            preparedStatement.close();
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
