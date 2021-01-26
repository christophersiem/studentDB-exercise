package de.neuefische.db;

import de.neuefische.model.Student;

import java.util.Arrays;

public class StudentDb {

    private Student[] students;

    public StudentDb(Student[] students) {
        this.students = students;
    }

    public Student[] list(){
        return students;
    }

    @Override
    public String toString() {
        return "StudentDb{" +
                "students=" + Arrays.toString(students) +
                '}';
    }
}
