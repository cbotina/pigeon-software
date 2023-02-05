package access;

public class EnrollmentQueryModel {

    int idEnrollment;
    String title;
    String name;
    int year;

    public EnrollmentQueryModel(int id, String title, String name, int year) {
        this.idEnrollment = id;
        this.name = name;
        this.title = title;
        this.year = year;
    }

    public Object[] toArray() {
        Object[] data = {idEnrollment, title, name, year};
        return data;
    }
}
