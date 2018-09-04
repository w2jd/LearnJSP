package com.waterhouse.sample;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

// Set servlet mapping
@WebServlet(name = "HelloServlet", urlPatterns = {"/path1", "/path2"})
public class HelloServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("doPost");
        response.setContentType("text/html; charset=utf-8");
        PrintWriter out = response.getWriter();

        out.println("<html><head><title>Test Java Servlet</title></head>");
        out.println("<body>");
        out.println("This is Post ☆");
        out.println("<h1>안녕 jsp servlet!!!!!!!!!!!!</h1>");
        out.println("</body></html>");

        out.flush();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("doGet");
        response.setContentType("text/html; charset=utf-8");
        PrintWriter out = response.getWriter();

        out.println("<html><head><title>Test Java Servlet</title></head>");
        out.println("<body>");
        out.println("This is Get ☆");
        out.println("<h1>안녕 jsp servlet!!!!!!!!!!!!</h1>");
        out.println("</body></html>");

        out.flush();
    }
}
