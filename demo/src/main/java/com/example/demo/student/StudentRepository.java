package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
//@Query("SELECT s FROM Student s WHERE s.email = ?1 ")
public interface StudentRepository extends JpaRepository <Student, Long> {
    Optional<Student> findStudentByEmail (String email);
}
