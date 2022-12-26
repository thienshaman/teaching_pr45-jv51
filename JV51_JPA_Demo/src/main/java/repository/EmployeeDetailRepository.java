package repository;

import entity.EmployeeDetail;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDetailRepository extends CrudRepository<EmployeeDetail, Integer> {
}
