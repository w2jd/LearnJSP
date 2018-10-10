package com.waterhouse.sample;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebListener;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "_006_Servlet_Context_Listener", urlPatterns = "/006")

/*
Set WebListener
Plan 1. Write web.xml
    <listener>
        <listener-class>[class name]</listener-class>
    </listener>
Plan 2. Write -.java
    @WebListener
*/
public class _006_Servlet_Context_Listener extends HttpServlet implements ServletContextListener {
    public _006_Servlet_Context_Listener() {
    }

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("(006) status : Contextinitialized");
    }

    @PostConstruct
    private void methodPostConstruct() {
        System.out.println("(006) status : PostConstruct");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("(006) status : init");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("(006) status : doPost");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("(006) status : doGet");
    }

    @Override
    public void destroy() {
        System.out.println("(006) status : destroy");
    }

    @PreDestroy
    private void methodPreDestroy() {
        System.out.println("(006) status : PreDestroy");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("(006) status : contextdestroyed");
    }


}
