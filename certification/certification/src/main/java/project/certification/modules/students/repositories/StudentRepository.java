package project.certification.modules.students.repositories;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import project.certification.modules.students.entities.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, UUID> {

    public Optional<StudentEntity> findByEmail(String email);
}
