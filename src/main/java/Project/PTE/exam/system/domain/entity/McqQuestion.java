package Project.PTE.exam.system.domain.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "MCQ_QUESTION")
public class McqQuestion extends BaseType{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "PASSAGE")
    private String passage;

    @Column(name = "OPTION_A")
    private String optionA;

    @Column(name = "OPTION_B")
    private String optionB;

    @Column(name = "OPTION_C")
    private String optionC;

    @Column(name = "OPTION_D")
    private String optionD;

    @Column(name = "ANSWER")
    private String answer;
}
