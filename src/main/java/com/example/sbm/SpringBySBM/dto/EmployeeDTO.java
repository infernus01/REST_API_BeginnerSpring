package com.example.sbm.SpringBySBM.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class EmployeeDTO {
    private long employeeId;
    private String employeeName;
    private LocalDate dateOfJoining;
    @JsonProperty("isActive")
    private boolean isActive;
}