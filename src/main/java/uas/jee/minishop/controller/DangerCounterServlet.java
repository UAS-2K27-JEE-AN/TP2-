package uas.jee.minishop.controller;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/danger")
public class DangerCounterServlet extends HttpServlet {
    // Compteur partagé par toutes les requêtes : volontairement non thread-safe pour le TP.
    private int counter = 0;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        counter += 2;

        resp.setContentType("text/plain; charset=UTF-8");
        resp.getWriter().println("Counter = " + counter);
        resp.getWriter().println("Thread = " + Thread.currentThread().getName());
        resp.getWriter().println("Instance = " + this.hashCode());
    }
}
