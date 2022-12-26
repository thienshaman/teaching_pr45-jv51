package demo;

import entity.Student;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import service.StudentService;
import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:beans.xml")
public class StudentServiceTest {
    @Autowired
    StudentService studentService;

    @Test
    public void getStudent_UC01() {
        Student actualStudent = studentService.getStudent();

        assertEquals(1, actualStudent.getId());
        assertEquals("Minh Hoang", actualStudent.getName());
        assertEquals("Good", actualStudent.getLevel());
    }
}

