package br.com.unialfa.ex02;

import br.com.unialfa.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DataSource {

    public int createTable() throws SQLException {
        Connection connection = null;
        try {
            connection = ConnectionFactory.getInstance().getConnection();
            PreparedStatement statement = connection.prepareStatement(
                    "CREATE TABLE IF NOT EXISTS `product` ("
                            + "  `id` INT NOT NULL AUTO_INCREMENT,"
                            + "  `name` VARCHAR(45) NULL,"
                            + "  `price` DECIMAL(10) NULL,"
                            + "  `quantity` INT NULL,"
                            + "  `brand` VARCHAR(45) NULL,"
                            + "  PRIMARY KEY (`id`));");
            int affectedRows = statement.executeUpdate();
            statement.close();
            return affectedRows;
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        } finally {
            if (connection != null) connection.close();
        }
    }

    public int dropTable() throws SQLException {
        Connection connection = null;
        try {
            connection = ConnectionFactory.getInstance().getConnection();
            PreparedStatement statement = connection.prepareStatement(
                    "DROP TABLE IF EXISTS `product`;");
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
