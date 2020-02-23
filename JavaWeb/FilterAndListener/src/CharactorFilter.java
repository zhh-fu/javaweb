import javax.servlet.*;
import java.io.IOException;

public class CharactorFilter implements Filter {

    String encoding=null;

    public void init(FilterConfig filterConfig) throws ServletException{
        encoding=filterConfig.getInitParameter("encoding");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException,ServletException{
        if(encoding!=null)
        {
            servletRequest.setCharacterEncoding("UTF-8");
            servletResponse.setContentType("text/html;charset=UTF-8");
        }
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {
        encoding=null;
    }
}
