import org.apache.catalina.core.ApplicationPart;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet(name ="UploadServlet",value="/show.jsp")
@MultipartConfig(location= "D:/java test documents/JavaWeb/Webtest")
public class UploadServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;enconding=UTF-8");
        PrintWriter out =response.getWriter();
        String path=request.getServletContext().getRealPath("/WEB-INF");
        System.out.println(path);
        Part p=request.getPart("file");
        if (p.getContentType().contains("image"))
        {
            ApplicationPart ap=(ApplicationPart) p;
            String fname1=ap.getSubmittedFileName();
            System.out.println(fname1);
            int path_idx=fname1.lastIndexOf("\\")+1;
            String fname2=fname1.substring(path_idx,fname1.length());
            p.write(path+"\\upload\\"+fname2);
            System.out.println("成功");
            out.write("文件上传成功");
        }
        else
        {
            out.write("请选择文件！");
        }
    }
}
