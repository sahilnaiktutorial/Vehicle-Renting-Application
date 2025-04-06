package com.jsp.vra.utility;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@AllArgsConstructor
public class ErrorStructure <T>{
    private int status;
    private String message;
    private T rootCause;
}
