package Anouj;

public class Employee {
    private int id;
    private String student;

    public Employee(int id, String student) {
        this.id = id;
        this.student = student;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public int getId() {
        return id;
    }

    public String getStudent() {
        return student;
    }
}
