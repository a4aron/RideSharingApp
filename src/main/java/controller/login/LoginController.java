package controller.login;

import constant.Constant;
import dao.UserDAO;
import model.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;


public class LoginController extends HttpServlet {
    private UserDAO dao;
//    ObjectMapper mapper = new ObjectMapper();

    @Override
    public void init() throws ServletException {
        dao = UserDAO.getInstance();
        List<User> cust= dao.getAllUsers();
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
        resp.sendRedirect("./jsp/Login.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String username = req.getParameter("uname");
        String password = req.getParameter("pass");
        String type = req.getParameter("type");
        if (isSuccess(username, password, type)) {
            HttpSession session = req.getSession();
            User user = new User(1, "",  LocalDate.now(), "", "", username, password, type,"");
            session.setAttribute(Constant.SESSION_KEY_USER, user);
            RequestDispatcher view ;
            if(type.equals(Constant.TYPE_USER)){
                view=req.getRequestDispatcher("./jsp/OrderDAO.jsp");
            }else{
                view=req.getRequestDispatcher("./jsp/Provider.jsp");
            }
            view.forward(req, resp);
        } else {
            resp.sendRedirect("./jsp/Login.jsp");
        }
    }

    private boolean isSuccess(String username, String password, String type) {
        return true;
    }
}
