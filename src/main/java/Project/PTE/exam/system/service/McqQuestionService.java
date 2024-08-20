package Project.PTE.exam.system.service;

import Project.PTE.exam.system.domain.entity.McqQuestion;
import Project.PTE.exam.system.repository.McqQuestionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class McqQuestionService {
    private final McqQuestionRepository mcqrepository;

    public List<McqQuestion> getAllMcqQuestion()
    {
        List<McqQuestion> mcqQuestion = mcqrepository.findAll();
        return mcqQuestion;
    }
}
