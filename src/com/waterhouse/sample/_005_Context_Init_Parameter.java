package com.waterhouse.sample;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "_005_Context_Init_Parameter", urlPatterns = "/005")
public class _005_Context_Init_Parameter extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String commonID = getServletContext().getInitParameter("common_id");
        String commonPw = getServletContext().getInitParameter("common_pw");
        String commonPath = getServletContext().getInitParameter("common_path");

        response.setContentType("text/html; charset=UTF-8");
        PrintWriter outScreen = response.getWriter();

        outScreen.println("<html><head><title>Test HTML tag</title></head>");
        outScreen.println("<body>");
        outScreen.println("Common ID : " + commonID + "<br/>");
        outScreen.println("Common PW : " + commonPw + "<br/>");
        outScreen.println("Common Path : " + commonPath + "<br/>");
        outScreen.println("</body></html>");

        outScreen.flush();
    }
}
