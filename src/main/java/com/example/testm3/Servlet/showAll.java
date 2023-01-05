package com.example.testm3.Servlet;

import com.example.testm3.DAO.EmployeeDAO;
import com.example.testm3.Modal.Employee;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/Home")
public class showAll extends HttpServlet {
    EmployeeDAO employeeDAO = new EmployeeDAO();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Employee> employees = employeeDAO.getAll();
        req.setAttribute("list",employees);
        RequestDispatcher dispatcher = req.getRequestDispatcher("showList.jsp");
        dispatcher.forward(req,resp);
    }
}
