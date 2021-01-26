package de.neuefische.db;

import de.neuefische.model.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentDbTest {

    @Test
    void listShouldReturnAllStudents() {

        //GIVEN
        Student student1 = new Student("Peter", 1);
        Student student2 = new Student("Franziska", 2);
        Student student3 = new Student("Maria", 3);
        Student[] students = {student1, student2, student3};
        StudentDb studentDb = new StudentDb(students);

        //WHEN
        Student[] actual = studentDb.list();

        //THEN
        assertArrayEquals(new Student[]{
                new Student("Peter", 1),
                new Student("Franziska", 2),
                new Student("Maria", 3)
        }, actual);

    }


}
