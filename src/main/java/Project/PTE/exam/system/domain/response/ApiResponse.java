package Project.PTE.exam.system.domain.response;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@RequiredArgsConstructor
public class ApiResponse<T> implements Serializable {
    private String responseCode;
    private T data;
}
