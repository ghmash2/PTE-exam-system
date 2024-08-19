package Project.PTE.exam.system.domain.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "RO_QUESTION")
public class RoQuestion extends BaseType{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "UNORDERED_SEQUENCE")
    private String unorderedSequence;

    @Column(name = "ORDERED_SEQUENCE")
    private String orderedSequence;

}
