package com.junit.utility;

import org.springframework.http.HttpStatusCode;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResponseBean<T> {

    private  T reponse;
    private HttpStatusCode status;
    private Integer returnCode;



}
