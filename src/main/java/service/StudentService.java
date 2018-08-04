package service;

import model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by CoT on 8/4/18.
 */
public interface StudentService extends CrudRepository<Student, Long> {
}
