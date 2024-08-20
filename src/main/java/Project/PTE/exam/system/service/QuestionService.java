package Project.PTE.exam.system.service;

import Project.PTE.exam.system.domain.entity.McqQuestion;
import Project.PTE.exam.system.domain.entity.Question;
import Project.PTE.exam.system.domain.entity.SstQuestion;
import Project.PTE.exam.system.domain.enums.QuestionTypeEnum;
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
import java.util.Optional;

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

    public ApiResponse<Object> getQuestionDetails(Long id){
        Object object = new Object();

        Optional<Question> questionOpt = questionRepository.findById(id);
        if(questionOpt.isEmpty()){
            return buildResponse(null);
        }
        else{
            Question question = questionOpt.get();
            object = getDetails(question.getQuestionType(), question.getQuestionCode());
        }
        return buildResponse(object);
    }

    private Object getDetails(String questionType, String questionCode){
      Object object = new Object();

        if(questionType.equals(QuestionTypeEnum.MCQ.getCode())){

            object = mcqQuestionRepository.findByQuestionCode(questionCode);

        } else if (questionType.equals(QuestionTypeEnum.SUMMARIZE.getCode())) {

            object = sstQuestionRepository.findByQuestionCode(questionCode);

        }else if(questionType.equals(QuestionTypeEnum.RE_ORDER.getCode())){

            object = roQuestionRepository.findByQuestionCode(questionCode);
        }
        else {
            return null;
        }
        return object;
    }


    public <T> ApiResponse<T> buildResponse(T data){
        ApiResponse<T> apiResponse = new ApiResponse<>();
        apiResponse.setResponseCode(ResponseCodeEnum.OPERATION_SUCCESSFUL.getCode());
        apiResponse.setData(data);

        return apiResponse;
    }
}
