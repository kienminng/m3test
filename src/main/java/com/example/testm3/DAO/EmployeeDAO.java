package com.example.testm3.DAO;

import com.example.testm3.Modal.Employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {
    static Connection  connection = ConnectMysql.getConnection();
    public List<Employee> getAll() {
        String selectAll = "select * from employee join department on employee.IdDepartment = department.IdDepartment;";

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(selectAll);
            List<Employee> nhanVien = new ArrayList<>();

            while (resultSet.next()) {
                String email = resultSet.getString("email");
                String name = resultSet.getString("name");
                String address = resultSet.getString("address");
                String phone = resultSet.getString("phone");
                double salary = resultSet.getDouble("salary");
                int id = resultSet.getInt("IdDepartment");
                String department = resultSet.getString("nameDepartment");
                nhanVien.add(new Employee(email,name,address,phone,salary,id,department));
            }
            return nhanVien;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public void save(Employee employee) {
        String insert = "INSERT INTO employee VALUE (?,?,?,?,?,?)";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(insert);
            preparedStatement.setString(1, employee.getEmail());
            preparedStatement.setString(2, employee.getName());
            preparedStatement.setString(3,employee.getAddress());
            preparedStatement.setString(4, employee.getPhone());
            preparedStatement.setDouble(5, employee.getSalary());
            preparedStatement.setInt(6,employee.getIdDepartment());

            preparedStatement.execute();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public  void update(Employee employee) {
        try {
            String sql = "update employee set name = ? , address=?,phone=?,salary=? ,idDepartment=? where email=?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, employee.getName());
            preparedStatement.setString(2, employee.getAddress());
            preparedStatement.setString(3, employee.getPhone());
            preparedStatement.setDouble(4, employee.getSalary());
            preparedStatement.setInt(5, employee.getIdDepartment());
            preparedStatement.setString(6, employee.getEmail());

            preparedStatement.execute();
        } catch (Exception throwables) {
            throwables.printStackTrace();
        }
    }

    public  void deleteUser(String email) {
        try {
            String sql = "DELETE FROM employ WHERE email = ? ;";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, email);
            preparedStatement.execute();
        } catch (Exception throwables) {
            throwables.printStackTrace();
        }
    }

    public Employee findEm(String email) {
        try {
            String sql = "select * FROM employee  WHERE email = ? ;";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, email);
            ResultSet resultSet = preparedStatement.executeQuery();

            resultSet.next();
            String name = resultSet.getString("name");
            String address = resultSet.getString("address");
            String phone = resultSet.getString("phone");
            double salary = resultSet.getDouble("salary");
            int id = resultSet.getInt("idDepartment");
            return new Employee(email, name, address, phone, salary, id);
        } catch (Exception throwables) {
            throwables.printStackTrace();
            return null;
        }
    }

    public Employee findByName(String nameFind) {
        String find = "SELECT * from employee " +
                "where email like '%" + nameFind + "%\'";
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(find);
            List<Employee> nhanviens = new ArrayList<>();

            resultSet.next();
                String email = resultSet.getString("email");
                String name = resultSet.getString("name");
                String address = resultSet.getString("address");
                String phone = resultSet.getString("phone");
                double salary = resultSet.getDouble("salary");
                int id = resultSet.getInt("idDepartment");
                return new Employee(email, name, address, phone, salary, id);


        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }


}
