package uas.jee.minishop.controller;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/safe")
public class SafeCounterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Integer counter = (Integer) req.getSession().getAttribute("counter");
        if (counter == null) {
            counter = 0;
        }
        counter++;
        req.getSession().setAttribute("counter", counter);

        resp.setContentType("text/plain; charset=UTF-8");
        resp.getWriter().println("Session Counter = " + counter);
        resp.getWriter().println("Thread = " + Thread.currentThread().getName());
        resp.getWriter().println("SessionId = " + req.getSession().getId());
    }
}
