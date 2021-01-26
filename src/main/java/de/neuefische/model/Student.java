package de.neuefische.model;

import java.util.Objects;

public class Student {

    private String firstName;
    private int id;


    public Student(String firstName, int id) {
        this.firstName = firstName;
        this.id = id;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(firstName, student.firstName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, id);
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", id=" + id +
                '}';
    }
}
