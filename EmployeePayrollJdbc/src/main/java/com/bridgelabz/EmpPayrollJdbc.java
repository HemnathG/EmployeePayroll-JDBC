package com.bridgelabz;

import java.sql.*;

public class EmpPayrollJdbc {
    public static void main(String[] args) {

        String jdbcUrl = "jdbc:mysql://localhost:3306/employee_payroll_service?useSSL=false";
        String userName = "root";
        String password = "Ghem29@Jan";
        Connection con;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded!");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        try {
            con = DriverManager.getConnection(jdbcUrl,userName,password);
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from employee_payroll");
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id"));
                System.out.println(resultSet.getString("name"));
                System.out.println(resultSet.getString("address"));
                System.out.println(resultSet.getString("department"));
                System.out.println(resultSet.getInt("Basic_Pay"));
                System.out.println(resultSet.getInt("deduction"));
                System.out.println(resultSet.getInt("taxable_pay"));
                System.out.println(resultSet.getInt("tax"));
                System.out.println(resultSet.getInt("net_pay"));
                System.out.println(resultSet.getString("start"));
                System.out.println(resultSet.getString("gender"));
                System.out.println(resultSet.getString("Phone_number"));
                System.out.println("----------------------------------");
            }
        } catch (SQLException e) {
            e.printStackTrace();

        }


    }
}
