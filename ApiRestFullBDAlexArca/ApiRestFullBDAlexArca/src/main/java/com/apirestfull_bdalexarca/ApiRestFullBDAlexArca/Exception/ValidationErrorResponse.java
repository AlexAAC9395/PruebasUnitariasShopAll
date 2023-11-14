package com.apirestfull_bdalexarca.ApiRestFullBDAlexArca.Exception;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;

@JsonInclude
@Data
public class ValidationErrorResponse {
    public String message;
    private List<String> errors;
    public ValidationErrorResponse(String message,List<String> errors){
        this.message= message;
        this.errors = errors;
    }
}
