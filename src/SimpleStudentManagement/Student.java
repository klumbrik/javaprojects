package SimpleStudentManagement;

public class Student {
    private String name;
    private int id;

    public Student(String name, int id) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "ID: " + id + " " + "Name: " + name;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setID(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

}
