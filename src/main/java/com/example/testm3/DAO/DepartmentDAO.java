package com.example.testm3.DAO;


import com.example.testm3.Modal.Department;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DepartmentDAO {

    public static List<Department> getAll() {
        String selectAll = "select * from department";
        Connection connection = ConnectMysql.getConnection();

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(selectAll);
            List<Department> list = new ArrayList<>();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                list.add(new Department(id, name));
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
