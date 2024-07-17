package com.example.demo.exercice5.controller;

import com.example.demo.exercice5.model.Dog;
import com.example.demo.exercice5.repository.DogRepository;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "dogservlet", value = "/dog/*")
public class DogServlet extends HttpServlet {

    private List<Dog> dogs;

    @Override
    public void init() throws ServletException {
        dogs = new ArrayList<>();
        dogs.add(new Dog(1, "rex", "saint-bernard", LocalDate.parse("2024-02-04")));
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String pathInfo = req.getPathInfo();
        System.out.println(pathInfo);
        switch (pathInfo){
            case "/view":
                req.setAttribute("dogs", dogs);
                req.getRequestDispatcher("/WEB-INF/dog/viewDogs.jsp").forward(req,resp);
                break;
            case "/add":
                req.getRequestDispatcher("/WEB-INF/dog/addDogs.jsp").forward(req,resp);
                break;
            case "/addlist":
                req.setAttribute("dogs", dogs);
                req.getRequestDispatcher("/WEB-INF/dog/viewList.jsp").forward(req,resp);
                break;
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
