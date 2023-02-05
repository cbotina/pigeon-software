package model;

public class UserModel {

    private String email;
    private String name;
    private String surname;
    private int age;
    private String password;
    private int idRole;

    public UserModel(String correoElectronico, String nombres, String apellidos, int edad, String contrasena, int idRol) {
        this.email = correoElectronico;
        this.name = nombres;
        this.surname = apellidos;
        this.age = edad;
        this.password = contrasena;
        this.idRole = idRol;
    }

    public UserModel(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getPassword() {
        return password;
    }

    public int getIdRole() {
        return idRole;
    }

    @Override
    public String toString() {
        return this.name + " " + this.surname;
    }
}
