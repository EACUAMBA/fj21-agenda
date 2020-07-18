package br.com.caelum.agenda.jdbc.dao;

import java.sql.*;
import java.util.Locale;
import java.util.ResourceBundle;

public class ConnectionFactory {
    private ResourceBundle rb = ResourceBundle.getBundle("messages", new Locale("pt", "MZ"));
    private Connection connection;
    public Connection getConnection() {

        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost/fj21", "root", "");

            System.out.println(rb.getString("connected.success"));
            return conexao;
        }catch (SQLException | ClassNotFoundException e){
            throw new RuntimeException(e);
        }
    }
    public void closeConnection(Connection connection){
        try {
            connection.close();
            System.out.println(rb.getString("close.connection"));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void closeConnection(Connection connection, PreparedStatement preparedStatement){
        closeConnection(connection);
        try {
            preparedStatement.close();
            System.out.println(rb.getString("close.preparedstatement"));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void closeConnection(Connection connection, PreparedStatement preparedStatement, ResultSet resultSet){
        closeConnection(connection, preparedStatement);
        try {
            resultSet.close();
            System.out.println(rb.getString("close.resultset"));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

