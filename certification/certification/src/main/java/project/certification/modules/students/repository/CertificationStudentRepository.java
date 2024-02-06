package project.certification.modules.students.repository;

i
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import project.certification.modules.students.entity.CertificationStudent;

import java.util.List;

@Repository
public interface CertificationStudentRepository extends JpaRepository<CertificationStudent,Long> {

    @Query("SELECT c FROM certifications c INNER JOIN c.studentEntity std WHERE std.email = :email AND c.technology = :technology")
    List<CertificationStudent> findByStudentEmailAndTechnology(String email, String technology);

    @Query("SELECT c from certifications c ORDER BY c.grade DESC LIMIT 10")
    List<CertificationStudent> findTop10ByOrderByGradeDesc();

}
