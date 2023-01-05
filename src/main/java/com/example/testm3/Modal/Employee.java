package com.example.testm3.Modal;

public class Employee {
    private String email;
    private String name;
    private String address;
    private String phone;
    private double salary;
    private int idDepartment;

    private String Department;

    public Employee() {
    }

    public Employee(String email, String name, String address, String phone, double salary,int idDepartment) {
        this.email = email;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.salary = salary;
        this.idDepartment = idDepartment;
    }

    public Employee(String email, String name, String address, String phone, double salary, int idDepartment, String department) {
        this.email = email;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.salary = salary;
        this.idDepartment = idDepartment;
        Department = department;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getIdDepartment() {
        return idDepartment;
    }

    public void setIdDepartment(int idDepartment) {
        this.idDepartment = idDepartment;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }
}
