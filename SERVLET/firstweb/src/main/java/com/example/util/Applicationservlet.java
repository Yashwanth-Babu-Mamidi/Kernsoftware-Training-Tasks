package com.example.util;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;   // FIXED IMPORT
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/")   // FIXED (case sensitive)
public class Applicationservlet extends HttpServlet {

    public Applicationservlet() {
        super();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {

        doGet(req, resp);   // better practice
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {

        String action = req.getServletPath(); // / , /services , /about

        switch (action) {
            case "/services":
                showservices(req,resp);
                break;

            default:
                showhome(req,resp);
                break;
        }
    }

    private void showhome(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {

        RequestDispatcher dispatcher = req.getRequestDispatcher("index.jsp");
        dispatcher.forward(req,resp);
    }

    private void showservices(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {

        RequestDispatcher dispatcher = 
                req.getRequestDispatcher("home/services.jsp"); // FIXED path
        dispatcher.forward(req,resp);
    }
}