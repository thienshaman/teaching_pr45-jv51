package demo;

import config.SpringConfig;
import entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import repository.StudentRepository;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        StudentRepository studentRepository = (StudentRepository) context.getBean("studentRepository");

        List<Student> students = (List<Student>) studentRepository.findAll();
        for (Student s : students) {
            System.out.println("name: " + s.getName());
        }

        Student student = (Student) studentRepository.findById(8).get();
        System.out.println("Name: " + student.getName());

    }
}
