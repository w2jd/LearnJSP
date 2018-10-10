package homework01;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(name = "CheckOut", urlPatterns = "/CheckOut")
public class CheckOut extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession();
        String username = (String) session.getAttribute("username");

        out.println("<center> <h2>" + username + "님이 선택한 상품 목록</h2>");
        out.println("<p style='padding-left:100px'><a href='LogOut'>로그아웃</a></p>");

        ArrayList<?> list = (ArrayList<?>)session.getAttribute("productlist");

        if (list == null) {
            out.println("선택한 상품이 없습니다.");
        } else {
            for (Object product:list) {
                out.println(product + "<br>");
            }
        }

        out.println("<a href=SelectProduct>돌아가기</a>");
        out.println("</center>");
    }
}
