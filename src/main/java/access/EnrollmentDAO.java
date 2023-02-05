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
import utils.ConnectionDB;

/**
 *
 * @author miper
 */
public class EnrollmentDAO {

    private Connection conn = null;

    // METODO PARA REGISTRAR UNA MATRICULA EN LA BASE DE DATOS
    public void insertEnrollment(String emailStudent, int idTutorie) {
        try {
            if (conn == null) {
                conn = ConnectionDB.getConnection();
            }
            String command = "INSERT INTO matriculas (id_estudiante, id_tutoria) VALUES (?,?);";
            PreparedStatement statement = conn.prepareStatement(command);
            statement.setString(1, emailStudent);
            statement.setInt(2, idTutorie);
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(null, "Matricula registrada");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode()
                    + "\nError :" + ex.getMessage());
        }
    }

    //METODO PARA OBTENER LAS MATRICULAS A LAS TUTORIAS DE UN PROFESOR EN ESPECIFICO DE ACUERDO A SU EMAIL
    public ArrayList<EnrollmentQueryModel> getEnrollmentsByTeacher(String teacherEmail) {
        ArrayList<EnrollmentQueryModel> usuarios = new ArrayList<>();
        try {
            if (conn == null) {
                conn = ConnectionDB.getConnection();
            }

            String sql = "SELECT matriculas.id_matricula, tutorias.titulo, CONCAT(usuarios.nombres,\" \", usuarios.apellidos) AS nombre, tutorias.año "
                    + "FROM usuarios JOIN matriculas ON matriculas.id_estudiante = usuarios.correo_electronico "
                    + "JOIN tutorias ON tutorias.id_tutoria = matriculas.id_tutoria "
                    + "WHERE id_docente_encargado = ? ;";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, teacherEmail);

            ResultSet result = statement.executeQuery();
            while (result.next()) {
                EnrollmentQueryModel usuario = new EnrollmentQueryModel(result.getInt(1), result.getString(2), result.getString(3), result.getInt(4));
                usuarios.add(usuario);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode()
                    + "\nError :" + ex.getMessage());
        }
        return usuarios;
    }

    // METODO PARA OBTENER TODAS LAS MATRICULAS DE LA INSTITUCION EDUCATIVA
    public ArrayList<EnrollmentQueryModel> getAllEnrollments() {
        ArrayList<EnrollmentQueryModel> usuarios = new ArrayList<>();
        try {
            if (conn == null) {
                conn = ConnectionDB.getConnection();
            }

            String sql = "SELECT matriculas.id_matricula, tutorias.titulo, CONCAT(usuarios.nombres,\" \", usuarios.apellidos) AS nombre, tutorias.año "
                    + "FROM usuarios JOIN matriculas ON matriculas.id_estudiante = usuarios.correo_electronico "
                    + "JOIN tutorias ON tutorias.id_tutoria = matriculas.id_tutoria ;";
            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery(sql);

            while (result.next()) {
                EnrollmentQueryModel usuario = new EnrollmentQueryModel(result.getInt(1), result.getString(2), result.getString(3), result.getInt(4));
                usuarios.add(usuario);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode()
                    + "\nError :" + ex.getMessage());
        }
        return usuarios;
    }

}
