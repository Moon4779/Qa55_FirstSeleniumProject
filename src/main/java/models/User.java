package models;

public class User {
    private String email;
    private String password;
// konstruktor
    public User(String email, String password) {
        this.email = email;
        this.password = password;
}

    public User() {

    }

    public String getEmail(){

        return email;
    }

    public String getPassword() {

        return password;
    }

    public User setEmail(String email) {

        this.email = email;
        return null;
    }

    public User setPassword(String password) {

        this.password = password;
        return null;
    }
}
