package com.example.demo.exercice4.controller;

import com.example.demo.exercice4.model.Cat;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "cats", value = "/cats")
public class CatServlet extends HttpServlet {

    private List<Cat> cats;

    @Override
    public void init() throws ServletException {
        cats = new ArrayList<>();
        cats.add(new Cat("felix", "siamois", "saumon", LocalDate.of(2010, 1, 1)));

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("cats", cats);
        request.getRequestDispatcher("/WEB-INF/cat/addCats.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String catName = req.getParameter("name");
        String catRace = req.getParameter("race");
        String catFavouriteFood = req.getParameter("favfood");
        String dateOfBirth = String.valueOf(LocalDate.parse(req.getParameter("date_de_naissance")));
        System.out.println(catName);
        System.out.println(catRace);
        System.out.println(catFavouriteFood);
        System.out.println(dateOfBirth);
    }
}
