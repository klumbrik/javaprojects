package ContactBook;

public class Contact extends Person {
    private String phone;
    private String email;

    Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }


    public String getInfo() {
        return " ";
    }

    @Override
    public String toString() {
        return "Name: " + name + "; Phone: " + phone + "; Email: " + email;
    }
}
