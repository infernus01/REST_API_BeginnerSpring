package com.example.sbm.SpringBySBM.entities;

import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@jakarta.persistence.Entity
@jakarta.persistence.Table(name="employees") //if not defined, then by default the class name would get reflected as the table name, i.e., EmployeeEntity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long employeeId;
    private String employeeName;
    private LocalDate dateOfJoining;
    private boolean isActive;
}
