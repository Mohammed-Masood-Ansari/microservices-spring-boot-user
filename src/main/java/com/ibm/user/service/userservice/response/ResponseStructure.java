package com.ibm.user.service.userservice.response;

import lombok.*;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ResponseStructure {

    private String msg;
    private boolean success;
    private HttpStatus httpStatus;

}
