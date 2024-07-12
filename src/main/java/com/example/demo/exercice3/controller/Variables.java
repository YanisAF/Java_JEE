package com.example.demo.exercice3.controller;

import com.example.demo.exercice3.model.Person;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "variables", value = "/variables")
public class Variables extends HttpServlet {

    private List<Person> people;

    @Override
    public void init() throws ServletException {

        people = new ArrayList<>();
        people.add(new Person("Joe", "Sam", 16));
        people.add(new Person("Joey", "Samy", 16));
        people.add(new Person("Youpi", "Spirou", 16));

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("people", people);
        req.getRequestDispatcher("/WEB-INF/person/variables.jsp").forward(req,resp);
    }
}
