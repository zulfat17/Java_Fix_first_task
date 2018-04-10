package ru.yakupov.servlets;

import ru.yakupov.models.Car;
import ru.yakupov.repository.CarRepository;
import ru.yakupov.repository.CarsRepositoryInMemoryImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

@WebServlet("/carsList")
public class GoodsServlet extends HttpServlet {
    private CarRepository carRepository;

    @Override
    public void init() throws ServletException {
        this.carRepository = new CarsRepositoryInMemoryImpl();
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Car>cars= carRepository.findAll();
        request.setAttribute("carsFromSalon", cars);
        RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("/jsp/carsList.jsp");
        dispatcher.forward(request, response);
    }
}