package project.certification.modules.questions.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.certification.modules.questions.entity.Questions;

import java.util.List;
import java.util.UUID;

public interface QuestionsRepository extends JpaRepository<Questions, UUID> {
    List<Questions> findByTechnology(String technology);
}
