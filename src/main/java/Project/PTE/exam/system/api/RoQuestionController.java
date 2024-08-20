package Project.PTE.exam.system.api;

import Project.PTE.exam.system.domain.entity.RoQuestion;
import Project.PTE.exam.system.service.RoQuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class RoQuestionController {
    private final RoQuestionService roservice;

    @GetMapping("/get/roQuestion")
    public List<RoQuestion> getAllRoQuestion(){
        List<RoQuestion> roQuestion = roservice.getAllRoQuestion();
        return roQuestion;
    }
}
