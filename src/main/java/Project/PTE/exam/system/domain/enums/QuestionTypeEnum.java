package Project.PTE.exam.system.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum QuestionTypeEnum {
    SUMMARIZE("sst", "Summarize Spoken Text"),
    RE_ORDER("ro", "Re-Order Paragraph"),
    MCQ("mcq", "Reading Multiple Choice");

    private String code;
    private String name;
}
