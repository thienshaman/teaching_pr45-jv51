package service;

import entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.StudentRepository;

import javax.transaction.Transactional;

@Service(value = "studentService")
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;
    @Override
    @Transactional
    public String givePoint(int studentGiveId, int studentTakeId, double point) {
        Student studentGive = (Student) studentRepository.findById(studentGiveId).get();
        if (studentGive == null) {
            return "Not existed studentGiveId";
        }

        Student studentTake = (Student) studentRepository.findById(studentTakeId).get();
        if (studentGive == null) {
            return "Not existed studentTakeId";
        }

        studentGive.setAvgMark(studentGive.getAvgMark() - point);
        studentRepository.save(studentGive);
        int a = 10 / 0;
        studentTake.setAvgMark(studentTake.getAvgMark() + point);
        studentRepository.save(studentTake);
        return "Success!";
    }
}
