package com.electro.electro_app.domain.DTOs;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApiError implements Serializable{
    private String backedMessage;
    private String message;
    private int httpCode;
    private LocalDateTime time;
}
