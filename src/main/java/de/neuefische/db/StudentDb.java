package de.neuefische.db;

import de.neuefische.model.Student;

import java.util.Arrays;


public class StudentDb {

    private Student[] students;

    public StudentDb(Student[] students) {
        this.students = students;
    }

    public Student[] list() {
        return students;
    }

    public Student getRandomStudent() {
        double random = Math.random();
        int randomIndex = (int) (random * students.length);
        return students[randomIndex];
    }

    public void add(Student student) {
        Student[] updatedStudents = new Student[students.length + 1];
        for (int i = 0; i < students.length; i++) {
            updatedStudents[i] = students[i];
        }

        updatedStudents[students.length] = student;

    }

    public void remove(int id) {
        if (!containsId(id)) {
            return;
        }

        Student[] updatedStudents = new Student[students.length - 1];
        boolean idFound = false;
        for (int i = 0; i < students.length - 1; i++) {
            Student student = students[i];
            if (student.getId() == id) {
                idFound = true;
            }
            int newIndex = idFound ? i + 1 : i;
            updatedStudents[i] = students[newIndex];

        }
        students = updatedStudents;
    }

    private boolean containsId(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return true;
            }
        }
        return false;
    }


    @Override
    public String toString() {
        return "StudentDb{" +
                "students=" + Arrays.toString(students) +
                '}';
    }
}
