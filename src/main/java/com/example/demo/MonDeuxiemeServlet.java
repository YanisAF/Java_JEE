package com.example.demo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "MonDeuxiemeServlet", value = "/mon-deuxieme-servlet")
public class MonDeuxiemeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        PrintWriter writer = response.getWriter();

        writer.println("<html><body>");
        writer.println("<h1>Je renvoie du texte simple !!!!!</h1>");
        writer.println("<h2>Bonjour !!!!!</h2>");
        writer.println("</body></html>");
    }

}
