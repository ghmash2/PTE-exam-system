package Project.PTE.exam.system.domain.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "ANSWERED_QUESTION")
public class AnsweredQuestion {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name = "USER_NAME")
    private String username;

    @Column(name = "QUESTION_CODE")
    private String questionCode;

    @Column(name = "SCORE")
    private Integer score;
}
