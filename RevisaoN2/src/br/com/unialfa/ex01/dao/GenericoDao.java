package br.com.unialfa.ex01.dao;

import java.sql.SQLException;
import java.util.ArrayList;

public interface GenericoDao<T> {

       public int insert(T objeto) throws SQLException;

       public ArrayList select() throws SQLException;

       public int update(T objeto) throws SQLException;

       public int remove(Integer id) throws SQLException;
}
