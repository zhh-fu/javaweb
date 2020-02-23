package operate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.sql.SQLException;

import source.setConnection;

@WebServlet(name = "UpdataServlet",urlPatterns = "/UpdataServlet")
public class UpdataServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        int id=Integer.parseInt(request.getParameter("id"));
        int bookCount=Integer.parseInt(request.getParameter("bookCount"));
        try
        {
            Connection connection = new setConnection().getConnection();
            String sql = "UPDATE tb_books SET bookCount=? WHERE id=?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, bookCount);
            preparedStatement.setInt(2, id);
            preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
        }
        catch (SQLException ex)
        {
            PrintWriter out=response.getWriter();
            out.print("数量修改失败！");
            ex.printStackTrace();
        }
        response.sendRedirect("FindServlet");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }
}
