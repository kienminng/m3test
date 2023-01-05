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

@WebServlet(urlPatterns = "/edit")
public class Edit extends HttpServlet {
    EmployeeDAO employeeDAO = new EmployeeDAO();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");
        Employee employee = employeeDAO.findEm(email);
        req.setAttribute("employee",employee);
        RequestDispatcher dispatcher = req.getRequestDispatcher("edit.jsp");
        dispatcher.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");
        String name = req.getParameter("name");
        String address = req.getParameter("address");
        String phone = req.getParameter("phone");
        double salary = Double.parseDouble(req.getParameter("salary"));
        int id = Integer.parseInt(req.getParameter("class"));

        employeeDAO.update(new Employee(email,name,address,phone,salary,id));
        resp.sendRedirect("/Home");
    }
}
