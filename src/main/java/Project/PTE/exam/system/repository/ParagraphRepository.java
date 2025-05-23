package Project.PTE.exam.system.repository;

import Project.PTE.exam.system.domain.entity.Paragraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParagraphRepository extends JpaRepository<Paragraph, Long> {
}
