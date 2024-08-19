package Project.PTE.exam.system.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum QuestionTypeEnum {
    SUMMARIZE("SST", "Summarize Spoken Text"),
    RE_ORDER("RO", "Re-Order Paragraph"),
    MCQ("MCQ", "Reading Multiple Choice");

    private String code;
    private String name;
}
