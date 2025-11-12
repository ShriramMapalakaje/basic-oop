package org.example.classesandobjects;

public class Student {
    public int id;
    public String name;
    public String DOB;
    public String Email;
    public String grade;

    Student() {

    }

    public Student(int id, String name, String DOB, String email, String grade) {
        this.id = id;
        this.name = name;
        this.DOB = DOB;
        Email = email;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", DOB='" + DOB + '\'' +
                ", Email='" + Email + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
}
