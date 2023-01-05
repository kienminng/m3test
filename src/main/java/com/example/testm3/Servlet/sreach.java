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

@WebServlet(urlPatterns = "/search")
public class sreach extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("search");
        EmployeeDAO employeeDAO = new EmployeeDAO();
        List<Employee> list = employeeDAO.findByName(email);
        req.setAttribute("list",list);
        RequestDispatcher dispatcher = req.getRequestDispatcher("showList.jsp");
        dispatcher.forward(req,resp);
    }
}
