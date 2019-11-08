package br.com.jdbc.model.dao;

import java.sql.Date;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import br.com.jdbc.model.bean.Employee;
import br.com.jdbc.model.ConnectionFactory;

public class EmployeeDao implements GenericoDao<Employee> {


       public int insert(Employee employee) throws SQLException {
              Connection connection = null;
              try {
                     connection = ConnectionFactory.getInstance().getConnection();
                     PreparedStatement statement = connection.prepareStatement("INSERT INTO `employees` "
                             + "(`name`, `address`, `phone`, `occupation`, `department`) VALUES (?, ?, ?, ?, ?)" );
                     statement.setString(1, employee.getName());
                     statement.setString(2, employee.getAddress());
                     statement.setString(3, employee.getPhone());
                     statement.setString(4, employee.getOccupation());
                     statement.setString(5, employee.getDepartment());
                     int affectedRows = statement.executeUpdate();
                     statement.close();
                     return affectedRows;

              } catch (SQLException e) {
                     throw new RuntimeException(e.getMessage());
              } finally {
                     if (connection != null) connection.close();
              }
       }

       public ArrayList select() throws SQLException {
              Connection connection = null;
              try {
                     connection = ConnectionFactory.getInstance().getConnection();
                     PreparedStatement statement = connection.prepareStatement("SELECT * FROM `employees`");
                     ResultSet resultSet = statement.executeQuery();
                     ArrayList<Employee> table = new ArrayList<>();
                     while (resultSet.next()) {
                            table.add(new Employee(
                                    resultSet.getInt("id"),
                                    resultSet.getString("name"),
                                    resultSet.getString("address"),
                                    resultSet.getString("phone"),
                                    resultSet.getString("Occupation"),
                                    resultSet.getString("department")
                            ));
                     }

                     statement.close();
                     resultSet.close();
                     return table;

              } catch (SQLException e) {
                     throw new RuntimeException(e.getMessage());
              } finally {
                     if (connection != null) connection.close();
              }
       }

       public int update(Employee employee, int id) throws SQLException {
              Connection connection  = null;
              try {
                     connection = ConnectionFactory.getInstance().getConnection();
                     PreparedStatement statement = connection.prepareStatement("UPDATE `employees` SET " +
                             "`name` = ?, `address` = ?, `phone` = ?, `occupation` = ?, `department` = ? WHERE `id` = ?");
                     statement.setString(1, employee.getName());
                     statement.setString(2, employee.getAddress());
                     statement.setString(3, employee.getPhone());
                     statement.setString(4, employee.getOccupation());
                     statement.setString(5, employee.getDepartment());
                     statement.setInt(6, id);
                     int affectedRows = statement.executeUpdate();
                     statement.close();
                     return affectedRows;

              } catch (SQLException e) {
                     throw new RuntimeException(e.getMessage());
              } finally {
                     if (connection != null) connection.close();
              }
       }

       public int update(Employee employee) throws SQLException {
              Connection connection  = null;
              try {
                     connection = ConnectionFactory.getInstance().getConnection();
                     PreparedStatement statement = connection.prepareStatement("UPDATE `employees` SET " +
                             "`name` = ?, `address` = ?, `phone` = ?, `occupation` = ?, `department` = ? WHERE `id` = ?");
                     statement.setString(1, employee.getName());
                     statement.setString(2, employee.getAddress());
                     statement.setString(3, employee.getPhone());
                     statement.setString(4, employee.getOccupation());
                     statement.setString(5, employee.getDepartment());
                     statement.setInt(6, employee.getId());
                     int affectedRows = statement.executeUpdate();
                     statement.close();
                     return affectedRows;

              } catch (SQLException e) {
                     throw new RuntimeException(e.getMessage());
              } finally {
                     if (connection != null) connection.close();
              }
       }

       public int remove(Integer id) throws SQLException {
              Connection connection = null;
              try {
                     connection = ConnectionFactory.getInstance().getConnection();
                     PreparedStatement statement = connection.prepareStatement("DELETE FROM `employees` " +
                             "WHERE (`id` = ?)");
                     statement.setInt(1, id);
                     int affectedRows = statement.executeUpdate();
                     statement.close();
                     return affectedRows;

              } catch (SQLException e) {
                     throw new RuntimeException(e.getMessage());
              } finally {
                     if (connection != null) connection.close();
              }
       }
}
