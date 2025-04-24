package models;

public class Contact {
    private String name;
    private String lastName;
    private String email;


    public String getName() {

        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public Contact setName(String name) {
        this.name = name;
        return this;
    }

    public Contact setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Contact setEmail(String email) {
        this.email = email;
        return this;
    }
}
