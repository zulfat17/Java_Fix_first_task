package ru.yakupov.servlets;

import ru.yakupov.models.Car;
import ru.yakupov.repository.CarsRepositoryInMemoryImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/adminka")
public class AdminLocation extends HttpServlet {

    CarsRepositoryInMemoryImpl carsRepository=new CarsRepositoryInMemoryImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getServletContext().getRequestDispatcher("/jsp/adminka.jsp").forward(req, resp);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String company=req.getParameter("company");
        String  model=req.getParameter("model");
        Integer maxSpeed=new Integer(req.getParameter("max_speed"));
        Integer price=new Integer(req.getParameter("price"));
        Car car=new Car(company,model,maxSpeed,price);
        carsRepository.save(car);
        doGet(req,resp);
    }
}
