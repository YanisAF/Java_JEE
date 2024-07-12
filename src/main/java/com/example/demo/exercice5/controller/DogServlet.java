package com.example.demo.exercice5.controller;

import com.example.demo.exercice5.model.Dog;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "dogServlet", value = "/dog/*")
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
                req.getRequestDispatcher("/WEB-INF/dog/viewDogs.jsp").forward(req,resp);
                break;
            case "/add":
                req.getRequestDispatcher("/WEB-INF/dog/addDogs.jsp").forward(req,resp);
                break;
            case "/viewlist":
                req.getRequestDispatcher("/WEB-INF/dog/viewList.jsp").forward(req,resp);
                break;
        }

    }

}
