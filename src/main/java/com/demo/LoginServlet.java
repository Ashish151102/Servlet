package com.demo;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "password";

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");

        try (PrintWriter out = response.getWriter()) {
            String user = request.getParameter("username");
            String pass = request.getParameter("password");

            if (USERNAME.equals(user) && PASSWORD.equals(pass)) {
                out.println("<h2>Login Successful! Welcome, " + user + "</h2>");
            } else {
                out.println("<h2>Invalid username or password!</h2>");
            }
        }
    }
}