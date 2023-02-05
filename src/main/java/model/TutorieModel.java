package model;

public class TutorieModel {

    private int idTutorie;
    private String title;
    private String description;
    private int year;
    private String idTeacher;

    public TutorieModel(String titulo, String descripcion, int año, String idDocentEncargado) {
        this.title = titulo;
        this.description = descripcion;
        this.year = año;
        this.idTeacher = idDocentEncargado;
    }

    public TutorieModel(int idTutoria, String titulo, String descripcion, int año, String idDocentEncargado) {
        this.idTutorie = idTutoria;
        this.title = titulo;
        this.description = descripcion;
        this.year = año;
        this.idTeacher = idDocentEncargado;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getYear() {
        return year;
    }

    public String getIdTeacher() {
        return idTeacher;
    }

    public int getIdTutorie() {
        return idTutorie;
    }

    public Object[] toArray() {
        Object[] data = {idTutorie, title, description, year, idTeacher};
        return data;
    }

    @Override
    public String toString() {
        return "Tutoria " + idTutorie;
    }

}
