package filter;

import constant.Constant;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(
        filterName = "LoginFilter",
        urlPatterns = {"/order", ""}
)
public class LoginFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.printf("doFilter");
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        if (req.getSession().getAttribute(Constant.SESSION_KEY_USER) == null) {
            HttpServletResponse resp = (HttpServletResponse) servletResponse;
            resp.sendRedirect("./jsp/Login.jsp");
        } else {
            filterChain.doFilter(servletRequest, servletResponse);
        }
    }

    @Override
    public void destroy() {

    }


}
