package entity;

public class Student {
    private String name;
    private String email;
    private String tel;
    private double gpa;
    private String level;

    public Student() {
    }

    public Student(String name, String email, String tel, double gpa, String level) {
        this.name = name;
        this.email = email;
        this.tel = tel;
        this.gpa = gpa;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
