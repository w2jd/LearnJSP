package com.waterhouse.sample;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

@WebServlet(name = "_003_HTML_Form_Tag", urlPatterns = "/html_tag")
public class _003_HTML_Form_Tag extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("Status : Post");

        // Set Charset when Post
        request.setCharacterEncoding("UTF-8");

        String name = request.getParameter("name");
        String id = request.getParameter("id");
        String password = request.getParameter("password");
        String[] hobby = request.getParameterValues("hobby");
        String job = request.getParameter("job");
        String protocol = request.getParameter("protocol");

        response.setContentType("text/html; charset=UTF-8");
        PrintWriter outScreen = response.getWriter();

        outScreen.println("<html><head><title>Test HTML tag</title></head>");
        outScreen.println("<body>");
        outScreen.println("ID / PW : " + id + " / " + password + "<br>");
        outScreen.println("이름 : " + name + "<br>");
        outScreen.println("직업 : " + job + "<br>");
        outScreen.println("취미 : " + Arrays.toString(hobby) + "<br>");
        outScreen.println("Protocol : " + protocol + "<br>");
        outScreen.println("</body></html>");

        System.out.println("name : " + name);

        outScreen.flush();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("Status : Get");

        response.setContentType("text/html; charset=utf-8");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("name");
        String id = request.getParameter("id");
        String password = request.getParameter("password");
        String[] hobby = request.getParameterValues("hobby");
        String job = request.getParameter("job");
        String protocol = request.getParameter("protocol");

        response.setContentType("text/html; charset=UTF-8");
        PrintWriter outScreen = response.getWriter();

        outScreen.println("<html><head><title>Test HTML tag</title></head>");
        outScreen.println("<body>");
        outScreen.println("ID / PW : " + id + " / " + password + "<br>");
        outScreen.println("이름 : " + name + "<br>");
        outScreen.println("직업 : " + job + "<br>");
        outScreen.println("취미 : " + Arrays.toString(hobby) + "<br>");
        outScreen.println("Protocol : " + protocol + "<br>");
        outScreen.println("</body></html>");

        outScreen.flush();
    }
}
