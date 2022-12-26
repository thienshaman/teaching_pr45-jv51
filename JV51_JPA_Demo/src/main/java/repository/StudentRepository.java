package repository;

import entity.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {

    public List<Student> findByLevel(String level);

    @Query("select s from Student s where s.level = ?1 and s.avgMark = ?2")
    public List<Student> getStudentsByLevelAndAvgMark(String level, double avgMark);

    @Query(value = "select * from student where avgMark = ?1", nativeQuery = true)
    public List<Student> getStudentsByAvgMark(double avgMark);

}
