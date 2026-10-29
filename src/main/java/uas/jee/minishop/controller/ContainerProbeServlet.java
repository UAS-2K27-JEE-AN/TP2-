package uas.jee.minishop.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/probe")
public class ContainerProbeServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        System.out.println("[PROBE] init() called - servlet instance = " + this.hashCode());
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String thread = Thread.currentThread().getName();
        int instance = this.hashCode();

        System.out.println("[PROBE] doGet() thread=" + thread + " instance=" + instance);
        resp.setContentType("text/plain; charset=UTF-8");
        resp.getWriter().println("Hello from /probe");
        resp.getWriter().println("Thread: " + thread);
        resp.getWriter().println("Servlet instance hash: " + instance);
    }
}
