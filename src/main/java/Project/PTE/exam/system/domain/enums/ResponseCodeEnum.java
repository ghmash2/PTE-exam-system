package Project.PTE.exam.system.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ResponseCodeEnum {

    OPERATION_SUCCESSFUL("S100", "Operation is Successful");


    private String code;
    private String message;
}
