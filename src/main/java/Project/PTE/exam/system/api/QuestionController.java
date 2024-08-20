package Project.PTE.exam.system.api;

import Project.PTE.exam.system.domain.entity.McqQuestion;
import Project.PTE.exam.system.domain.response.ApiResponse;
import Project.PTE.exam.system.domain.response.QuestionResponse;
import Project.PTE.exam.system.service.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class QuestionController {

    private final QuestionService questionService;

    @GetMapping("/get/questions")
    public ApiResponse<List<QuestionResponse>> getAllMcqQuestion(@RequestParam(required = false) String questionType){
        return questionService.getQuestions(questionType);
    }
}
