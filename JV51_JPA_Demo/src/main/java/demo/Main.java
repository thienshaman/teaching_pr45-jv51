package demo;

import config.SpringConfig;
import entity.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import repository.*;
import service.StudentService;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        StudentService studentService = (StudentService) context.getBean("studentService");
        System.out.println(studentService.givePoint(1, 8, 2));
//        EmployeeRepository employeeRepository = (EmployeeRepository) context.getBean("employeeRepository");
//        Employee employee = (Employee) employeeRepository.findById(2).get();
//        System.out.println("Name: " + employee.getName());
//        System.out.println("Email: " + employee.getEmployeeDetail().getEmail());
//        System.out.println("Dept: " + employee.getDepartment().getName());
//        for (Project p : employee.getProjects()) {
//            System.out.println("Project name: " + p.getName());
//        }

//        ProjectRepository projectRepository = (ProjectRepository) context.getBean("projectRepository");
//        Project project = (Project) projectRepository.findById(1).get();
//        System.out.println("Name: " + project.getName());
//        for (Employee e : project.getEmployees()) {
//            System.out.println("Employee Name: " + e.getName());
//        }

//        DepartmentRepository departmentRepository = (DepartmentRepository) context.getBean("departmentRepository");
//
//        Department department = (Department) departmentRepository.findById(2).get();
//        System.out.println("Name: " + department.getName());
//
//        for (Employee e : department.getEmployees()) {
//            System.out.println("Employee Name: " + e.getName());
//        }

//        EmployeeDetailRepository employeeDetailRepository = (EmployeeDetailRepository) context.getBean("employeeDetailRepository");
//        EmployeeDetail detail = (EmployeeDetail) employeeDetailRepository.findById(2).get();
//        System.out.println("Email: " + detail.getEmail());
//        System.out.println("Name: " + detail.getEmployee().getName());


    }
}
