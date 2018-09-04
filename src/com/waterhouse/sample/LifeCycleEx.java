package com.waterhouse.sample;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LifeCycleEx",  urlPatterns = {"/lifecycle"})
public class LifeCycleEx extends HttpServlet {
    /* Servlet Lifecycle ; Sequence
     * Servlet 생성 → @PostConstruct → Call init() → Call Service(), doGet(), doPost() → @PreDestroy → Call destroy()
     * */

    public LifeCycleEx() {
        super();
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("Status : init");
        super.init(config);
    }

    @PostConstruct
    private void methodPostConstruct() {
        System.out.println("Status : PostConstruct");
    }




    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Status : Service");
        super.service(req, resp);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("Status : doPost");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("Status : doGet");
    }



    @PreDestroy
    private void methodPreDestroy() {
        System.out.println("Status : PreDestroy");
    }

    @Override
    public void destroy() {
        System.out.println("Status : destroy");
        super.destroy();
    }
}
