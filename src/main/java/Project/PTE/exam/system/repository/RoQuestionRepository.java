package Project.PTE.exam.system.repository;

import Project.PTE.exam.system.domain.entity.RoQuestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoQuestionRepository extends JpaRepository<RoQuestion, Long> {
}
