/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package access;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import javax.swing.JOptionPane;
import model.UserModel;
import utils.ConnectionDB;

/**
 *
 * @author miper
 */
public class UserDAO {

    private Connection conn = null;

    public UserModel getUserByEmail(String email) {
        UserModel user = null;
        try {
            if (conn == null) {
                conn = ConnectionDB.getConnection();
            }

            String sql = "SELECT correo_electronico, nombres, apellidos, edad, contrasena, id_rol FROM usuarios WHERE correo_electronico = ?;";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, email);
            ResultSet result = statement.executeQuery();

            while (result.next()) {
                user = new UserModel(email, result.getString(2), result.getString(3), result.getInt(4), result.getString(5), result.getInt(6));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode()
                    + "\nError :" + ex.getMessage());
        }
        return user;
    }

    public HashMap<String, String> getEmailsPasswords() {
        HashMap<String, String> data = new HashMap<>();
        try {
            if (conn == null) {
                conn = ConnectionDB.getConnection();
            }

            String sql = "SELECT correo_electronico, contrasena FROM usuarios;";
            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery(sql);

            while (result.next()) {
                data.put(result.getString(1), result.getString(2));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode()
                    + "\nError :" + ex.getMessage());
        }
        return data;
    }

    public void insertUser(UserModel user) {
        try {
            if (conn == null) {
                conn = ConnectionDB.getConnection();
            }
            String command = "INSERT INTO usuarios (correo_electronico, nombres, apellidos, edad, contrasena, id_rol) "
                    + "values (?,?,?,?,?,?)";
            PreparedStatement statement = conn.prepareStatement(command);
            statement.setString(1, user.getEmail());
            statement.setString(2, user.getName());
            statement.setString(3, user.getSurname());
            statement.setInt(4, user.getAge());
            statement.setString(5, user.getPassword());
            statement.setInt(6, user.getIdRole());
            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(null, "Usuario Creado!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode()
                    + "\nError :" + ex.getMessage());
        }
    }

    public void updateUserPassword(String newPassword, String email) {
        try {
            if (conn == null) {
                conn = ConnectionDB.getConnection();
            }

            String command = "UPDATE usuarios SET contrasena = ? WHERE correo_electronico = ?";
            PreparedStatement statement = conn.prepareStatement(command);
            statement.setString(1, newPassword);
            statement.setString(2, email);
            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(null, "Se cambio la contraseña correctamente");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode()
                    + "\nError :" + ex.getMessage());
        }
    }

}
