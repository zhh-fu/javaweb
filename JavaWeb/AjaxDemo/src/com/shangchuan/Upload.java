package com.shangchuan;

import org.apache.tomcat.util.http.fileupload.FileItem;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;

public class Upload extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        HttpSession httpSession=request.getSession();
        httpSession.setAttribute("progressBar",0);
        String error="";
        int max=50*1024*1024;
        DiskFileItemFactory factory=new DiskFileItemFactory();
        ServletFileUpload upload=new ServletFileUpload();
        try
        {
            List items = upload.parseRequest(request);
            Iterator itr=items.iterator();
            while (itr.hasNext())
            {
                FileItem item =(FileItem) itr.next();
                if (!item.isFormField())
                {
                    if (item.getName()!=null&&!item.getName().equals(""))
                    {
                        long upFileSize = item.getSize();
                        String filename=item.getName();
                        if (upFileSize>max)
                        {
                            error="您上传的文件太大，请不要超过50MB！";
                            break;
                        }
                        File tempFile=new File(filename);
                        File file = new File(request.getRealPath("/upload"),tempFile.getName());
                        InputStream is=item.getInputStream();
                        int buffer=1024;
                        int length=0;
                        byte[] b =new byte[buffer];
                        double percent=0;
                        FileOutputStream fos=new FileOutputStream(file);
                        while((length=is.read(b))!=-1)
                        {
                            percent=percent+length/(double) upFileSize*100D;
                            fos.write(b,0,length);
                            httpSession.setAttribute("progressBar",Math.round(percent));
                        }
                        fos.close();
                        Thread.sleep(1000);
                    }
                    else
                    {
                        error="没有选择上传文件！";
                    }
                }
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
            error="文件上传出现错误：" + ex.getMessage();
        }
//        if (!"".equals(error))
//        {
//            request.setAttribute("error",error);
//            request.getRequestDispatcher(error.jsp)
//        }
    }
}
