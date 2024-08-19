package Project.PTE.exam.system.domain.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "PARAGRAPH")
public class Paragraph {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "PARAGRAPH_CODE", unique = true)
    private String paragraphCode;

    @Column(name = "PARAGRAPH")
    private String paragraph;
}
