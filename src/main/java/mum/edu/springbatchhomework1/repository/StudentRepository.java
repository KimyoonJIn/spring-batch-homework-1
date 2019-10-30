package mum.edu.springbatchhomework1.repository;

import mum.edu.springbatchhomework1.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
