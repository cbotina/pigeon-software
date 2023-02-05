/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author miper
 */
public class EnrollmentModel {

    private int idEnrollment;
    private String idStudent;
    private int idTutorie;

    public EnrollmentModel(int idMatricula, String idEstudiante, int idTutoria) {
        this.idEnrollment = idMatricula;
        this.idStudent = idEstudiante;
        this.idTutorie = idTutoria;
    }

    public int getIdTutorie() {
        return idTutorie;
    }
}
