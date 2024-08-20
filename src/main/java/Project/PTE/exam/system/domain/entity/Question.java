package Project.PTE.exam.system.domain.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "QUESTION")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "QUESTION_CODE")
    private String questionCode;

    @Column(name = "QUESTION_TYPE")
    private String questionType;

    @Column(name = "TITLE")
    private String  title;

}
