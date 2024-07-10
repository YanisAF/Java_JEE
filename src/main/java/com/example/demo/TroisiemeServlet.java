package com.example.demo;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "TroisiemeServlet", value = "/troisieme-servlet")
public class TroisiemeServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Une requête à été envoyé à /troisime-servlet");
        getServletContext().getRequestDispatcher("/test.jsp").forward(req,resp);
    }
}
