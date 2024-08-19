package Project.PTE.exam.system.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;

import java.io.Serializable;

@MappedSuperclass
@Data
public class BaseType implements Serializable {

    @Column(name = "TITLE")
    private String title;

    @Column(name = "QUESTION_CODE")
    private String questionCode;

    @Column(name = "QUESTION_TYPE")
    private String questionType;
}
