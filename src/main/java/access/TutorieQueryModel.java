package access;

public class TutorieQueryModel {

    private int amount;
    private String title;

    private int idTutorie;
    private String studentName;
    private int year;

    public TutorieQueryModel(int amount, String title) {
        this.amount = amount;
        this.title = title;
    }

    public TutorieQueryModel(int idTutorie, String title, int year) {
        this.idTutorie = idTutorie;
        this.title = title;
        this.year = year;
    }

}
