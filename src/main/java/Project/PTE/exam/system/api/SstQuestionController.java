package Project.PTE.exam.system.api;

import Project.PTE.exam.system.domain.entity.SstQuestion;
import Project.PTE.exam.system.service.SstQuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class SstQuestionController {
    private final SstQuestionService sstservice;

    @GetMapping("/get/sstQuestion")
    public List<SstQuestion> getAllSstQuestion(){
        List<SstQuestion> sstQuestion = sstservice.getAllSstQuestion();
        return sstQuestion;
    }

}
