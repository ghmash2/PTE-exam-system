package Project.PTE.exam.system.domain.response;

import Project.PTE.exam.system.domain.entity.Question;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class QuestionResponse implements Serializable {
    private Long id;
    private String title;

    public static QuestionResponse convert(Question question){
        return QuestionResponse.builder()
                .id(question.getId())
                .title(question.getTitle())
                .build();
    }
}
