package Project.PTE.exam.system.domain.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "SST_QUESTION")
public class SstQuestion extends BaseType{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


}
