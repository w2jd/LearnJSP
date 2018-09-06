package com.waterhouse.sample;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

@WebServlet(name = "_004_Init_Parameter")
public class _004_Init_Parameter extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String initId = getInitParameter("id");
        String initPw = getInitParameter("pw");
        String initPath = getInitParameter("path");

        response.setContentType("text/html; charset=UTF-8");
        PrintWriter outScreen = response.getWriter();

        outScreen.println("<html><head><title>Test HTML tag</title></head>");
        outScreen.println("<body>");
        outScreen.println("ID : " + initId + "<br/>");
        outScreen.println("PW : " + initPw + "<br/>");
        outScreen.println("Path : " + initPath + "<br/>");
        outScreen.println("</body></html>");

        outScreen.flush();
    }
}
