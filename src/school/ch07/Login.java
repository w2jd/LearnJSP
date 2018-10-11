package school.ch07;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Login", urlPatterns = "/school/Login")
public class Login extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        LoginBean login = new LoginBean();
        String address;

        login.setUserid(request.getParameter("userid"));
        login.setPasswd(request.getParameter("passwd"));

        if (login.checkUser()) {
            address = "/school/ch07/login_success.jsp";
        } else {
            address = "/school/ch07/login_fail.jsp";
            login.setError("Invalid userid/passwd");
        }
        request.setAttribute("userinfo", login);
        RequestDispatcher dispatcher = request.getRequestDispatcher(address);
        dispatcher.forward(request, response);
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
