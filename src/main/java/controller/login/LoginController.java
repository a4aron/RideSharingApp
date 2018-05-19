package controller.login;

import constant.Constant;
import model.User;
import model.Customer;
import dao.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.util.List;


public class LoginController extends HttpServlet {
    private CustomerDAO dao;
//    ObjectMapper mapper = new ObjectMapper();

    @Override
    public void init() throws ServletException {
        dao = CustomerDAO.getInstance();
        List<Customer> cust= dao.getAllCustomers();
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
        RequestDispatcher view = req.getRequestDispatcher("/jsp/Login.jsp");
        view.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String username = req.getParameter("uname");
        String password = req.getParameter("pass");
        String type = req.getParameter("type");
        if (isSuccess(username, password, type)) {
            HttpSession session = req.getSession();
            User user = new User("", "", "", "", "", username, password, type);
            session.setAttribute(Constant.SESSION_KEY_USER, user);
            RequestDispatcher view ;
            if(type.equals(Constant.TYPE_USER)){
                view=req.getRequestDispatcher("./jsp/Order.jsp");
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
