package Project.PTE.exam.system.repository;

import Project.PTE.exam.system.domain.entity.McqQuestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface McqQuestionRepository extends JpaRepository<McqQuestion,Long> {
}
