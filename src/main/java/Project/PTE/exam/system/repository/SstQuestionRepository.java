package Project.PTE.exam.system.repository;

import Project.PTE.exam.system.domain.entity.SstQuestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SstQuestionRepository extends JpaRepository<SstQuestion, Long> {
}
