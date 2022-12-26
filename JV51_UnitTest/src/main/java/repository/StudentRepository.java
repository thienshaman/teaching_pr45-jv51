package repository;

import entity.Student;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {
    public Student findStudentById() {
        Student student = new Student();
        student.setId(1);
        student.setName("Minh Hoang");
        student.setLevel("Good");

        return student;
    }
}
