package mahder.springboot10.springboot10.repository;

import mahder.springboot10.springboot10.models.Course;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, Long> {
}
