package Project.PTE.exam.system.service;

import Project.PTE.exam.system.domain.entity.Question;
import Project.PTE.exam.system.domain.enums.ResponseCodeEnum;
import Project.PTE.exam.system.domain.response.ApiResponse;
import Project.PTE.exam.system.domain.response.QuestionResponse;
import Project.PTE.exam.system.repository.McqQuestionRepository;
import Project.PTE.exam.system.repository.QuestionRepository;
import Project.PTE.exam.system.repository.RoQuestionRepository;
import Project.PTE.exam.system.repository.SstQuestionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
@RequiredArgsConstructor
public class QuestionService {

    private final QuestionRepository questionRepository;
    private final SstQuestionRepository sstQuestionRepository;
    private final RoQuestionRepository roQuestionRepository;
    private final McqQuestionRepository mcqQuestionRepository;


    public ApiResponse<List<QuestionResponse>> getQuestions(String questionType){
        List<QuestionResponse> questions = questionRepository.getQuestions(questionType).stream().map(QuestionResponse::convert).toList();
        return buildResponse(questions);
    }


    private ApiResponse<List<QuestionResponse>> buildResponse(List<QuestionResponse> data){
        ApiResponse<List<QuestionResponse>> apiResponse = new ApiResponse<>();
        apiResponse.setResponseCode(ResponseCodeEnum.OPERATION_SUCCESSFUL.getCode());
        apiResponse.setData(data);

        return apiResponse;
    }
}
