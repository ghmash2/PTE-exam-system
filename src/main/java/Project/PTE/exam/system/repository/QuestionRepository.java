package Project.PTE.exam.system.repository;

import Project.PTE.exam.system.domain.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {

    @Query("SELECT q FROM Question q Where :questionType is null or q.questionType = :questionType" )
    List<Question> getQuestions(String questionType);
}
