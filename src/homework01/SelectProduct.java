package homework01;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SelectProduct", urlPatterns = "/SelectProduct")
public class SelectProduct extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        String username = request.getParameter("username");
        HttpSession session = request.getSession();
        session.setAttribute("username", username);

        PrintWriter out = response.getWriter();
        out.println("<center>");
        out.println("<h2>상품 선택</h2>");
        out.println(username + "님이 로그인한 상태입니다");
        out.println("<p align='right'><a href='LogOut'>로그아웃</a></p>");
        out.println("<hr>");
        out.println("<form name=form2 method=post action=AddProduct target='_blank'>");
        out.println("	<select name=product>");
        out.println("		<option>[Apple] iPhone</option>");
        out.println("		<option>[Huawei] P20</option>");
        out.println("		<option>[LG] G10</option>");
        out.println("		<option>[Samsung] Galaxy 9</option>");
        out.println("		<option>[Sony] Xperia XZ Premium</option>");
        out.println("	</select>");
        out.println("	<input type=submit value=추가 />");
        out.println("</form>");
        out.println("<a href=CheckOut>결재</a>");
        out.println("</center>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
