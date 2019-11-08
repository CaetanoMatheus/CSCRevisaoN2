package br.com.jdbc.model;

import br.com.jdbc.model.bean.Employee;
import br.com.jdbc.model.dao.EmployeeDao;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
        EmployeeDao dao = new EmployeeDao();
        Employee emp = new Employee("Ricardo", "Rua a 123" ,"221234567", "Policial", "Segurança");

        try {
            dao.insert(emp);
            System.out.println(dao.select());
            dao.update(emp, 1);
            dao.remove(1);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
