package Project.PTE.exam.system.service;

import Project.PTE.exam.system.domain.entity.RoQuestion;
import Project.PTE.exam.system.repository.RoQuestionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RoQuestionService {
    private final RoQuestionRepository rorepository;

    public List<RoQuestion> getAllRoQuestion()
    {
        List<RoQuestion> roQuestion = rorepository.findAll();
        return roQuestion;
    }
}

