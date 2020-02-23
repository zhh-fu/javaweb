import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="AddServlet",value="/show.jsp")
public class AddServlet extends HttpServlet {
    private static final long serialVersionUID=1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
        doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
        //response.setCharacterEncoding("utf-8");
        //response.setContentType("text/html;charset=utf-8");
        PrintWriter out=response.getWriter();
        String id=request.getParameter("id");
        String name=request.getParameter("name");
        String author=request.getParameter("author");
        String price=request.getParameter("price");
        out.print("<h2>图书添加成功</h2><hr/>");
        out.print("图书编码是："+ id+"<br>");
        out.print("图书名字是："+ name +"<br>");
        out.print("图书作者是："+ author +"<br>");
        out.print("图书价格是："+ price + "<br>");                          //out是PrintWrite的对象，作用域是网页中，相当于直接编写HTML语言
        out.flush();                                                        //如果采用System.out.print 则是打印在命令行中，并不能显示在网页中。
        out.close();
    }
}
