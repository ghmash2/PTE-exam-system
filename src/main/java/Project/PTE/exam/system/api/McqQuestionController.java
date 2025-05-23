package Project.PTE.exam.system.api;

import Project.PTE.exam.system.domain.entity.McqQuestion;
import Project.PTE.exam.system.service.McqQuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class McqQuestionController {
    private final McqQuestionService mcqservice;

    @GetMapping("/get/mcqQuestion")
    public List<McqQuestion> getAllMcqQuestion(){
        List<McqQuestion> mcqQuestion = mcqservice.getAllMcqQuestion();
        return mcqQuestion;
    }
}
