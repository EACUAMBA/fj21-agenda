package br.com.caelum.agenda.jdbc.dao;


import java.sql.*;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import java.util.ResourceBundle;

import br.com.caelum.agenda.jdbc.modelo.Contacto;

public class ContactoDao {
    ResourceBundle resourceBundle = ResourceBundle.getBundle("messages", new Locale("pt", "MZ"));
    private Connection connection;

    public  ContactoDao(Connection connection){
        this.connection = connection;
    }
    public  ContactoDao(){
        this.connection = new ConnectionFactory().getConnection();
    }

    public void adiciona(Contacto contacto) {
        String sql = "INSERT INTO contactos(nome, email, endereco, dataNascimento) VALUES (?,?,?,?)";
        PreparedStatement preparedStatement = null;
       try {
            preparedStatement = this.connection.prepareStatement(sql);
            preparedStatement.setString(1, contacto.getNome());
            preparedStatement.setString(2, contacto.getEmail());
            preparedStatement.setString(3, contacto.getEndereco());
            preparedStatement.setDate(4,  Date.valueOf(contacto.getDataNascimento()));
            preparedStatement.execute();
            System.out.println(resourceBundle.getString("insert.success"));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void actualiza(Contacto contacto){
        String sql = "UPDATE contactos SET nome=?, email=?, endereco=?, dataNascimento=? WHERE id=?";
        PreparedStatement preparedStatement = null;
        try{
            preparedStatement = this.connection.prepareStatement(sql);
            preparedStatement.setString(1, contacto.getNome());
            preparedStatement.setString(2, contacto.getEmail());
            preparedStatement.setString(3, contacto.getEndereco());
            Date data = Date.valueOf(contacto.getDataNascimento());
            preparedStatement.setDate(4, data);
            preparedStatement.setLong(5, contacto.getId());
            preparedStatement.execute();
            System.out.println(resourceBundle.getString("update.success"));
        }catch(SQLException e){
            throw new RuntimeException(e);

        }
    }
    public ArrayList<Contacto> getLista(){
        String sql = "SELECT * FROM contactos";
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        ArrayList<Contacto> contactos = new ArrayList<Contacto>();
        try{
            preparedStatement = this.connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();

            while(resultSet.next()){
                Contacto contacto = new Contacto();
                contacto.setId(resultSet.getLong("id"));
                contacto.setNome(resultSet.getString("nome"));
                contacto.setEmail(resultSet.getString("email"));
                contacto.setEndereco(resultSet.getString("endereco"));
                LocalDate localDate = resultSet.getDate("dataNascimento").toLocalDate();

                contacto.setDataNascimento(localDate);
                contactos.add(contacto);
            }
            System.out.println(resourceBundle.getString("select.success"));
            return contactos;
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

    public void apagar(Contacto contacto){
        String sql = "DELETE FROM contactos WHERE id = ?";
        PreparedStatement preparedStatement = null;
        try{
            preparedStatement = this.connection.prepareStatement(sql);
            preparedStatement.setLong(1, contacto.getId());
            preparedStatement.execute();
            System.out.println(resourceBundle.getString("delete.success"));
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
}

