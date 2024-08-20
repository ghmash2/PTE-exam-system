package Project.PTE.exam.system.service;

import Project.PTE.exam.system.domain.entity.SstQuestion;
import Project.PTE.exam.system.repository.SstQuestionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
@RequiredArgsConstructor
public class SstQuestionService {
    private final SstQuestionRepository sstrepository;

    public List<SstQuestion> getAllSstQuestion()
    {
        List<SstQuestion> sstQuestion = sstrepository.findAll();
        return sstQuestion;
    }
}
