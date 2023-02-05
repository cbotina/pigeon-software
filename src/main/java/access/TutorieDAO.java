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
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.TutorieModel;
import utils.ConnectionDB;

/**
 *
 * @author miper
 */
public class TutorieDAO {

    private Connection conn = null;

    // Método que a través de una consulta SQL a la base de datos permite traer todas las tutorías impartidas por distintos docentes
    public ArrayList<TutorieModel> getAllTutorias() {
        ArrayList<TutorieModel> tutorias = new ArrayList<>();
        try {
            if (conn == null) {
                conn = ConnectionDB.getConnection();
            }

            String sql = "SELECT id_tutoria, titulo, descripcion, año, id_docente_encargado nombre FROM tutorias;";
            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery(sql);

            while (result.next()) {
                TutorieModel tutoria = new TutorieModel(result.getInt(1), result.getString(2), result.getString(3), result.getInt(4), result.getString(5));
                tutorias.add(tutoria);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode()
                    + "\nError :" + ex.getMessage());
        }
        return tutorias;
    }

    public void insertTutorie(TutorieModel tutorie) {
        try {
            if (conn == null) {
                conn = ConnectionDB.getConnection();
            }
            String command = "INSERT INTO tutorias (titulo, descripcion, año, id_docente_encargado) "
                    + "values (?,?,?,?);";
            PreparedStatement statement = conn.prepareStatement(command);
            statement.setString(1, tutorie.getTitle());
            statement.setString(2, tutorie.getDescription());
            statement.setInt(3, tutorie.getYear());
            statement.setString(4, tutorie.getIdTeacher());

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(null, "Se ha creado la tutoría correctamente");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode()
                    + "\nError :" + ex.getMessage());
        }
    }
}
