package com.jsp.vra.utility;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ResponseStructure <T>{
    int status;
    String message;
    T data;
}
