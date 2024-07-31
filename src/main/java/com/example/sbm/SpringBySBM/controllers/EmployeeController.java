package com.example.sbm.SpringBySBM.controllers;

import com.example.sbm.SpringBySBM.dto.EmployeeDTO;
import com.example.sbm.SpringBySBM.services.EmployeeService;
import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path="/employees")
public class EmployeeController {
    private final EmployeeService employeeService;
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;

    }
    @GetMapping
    public List<EmployeeDTO> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping(path="/{id}")
//    public String getEmployees(){
//        return "Inside the function get employees";
//    }
    public EmployeeDTO getEmployeeById(@PathVariable("id") Long empID){
        return employeeService.getEmployeeByID(empID);
    }
    @PostMapping
    public EmployeeDTO createNewEmployee(@RequestBody EmployeeDTO employeeDTO){
        return employeeService.createNewEmployee(employeeDTO);
    }

    @DeleteMapping(path="/{id}")
    public boolean deleteEmployeeById(@PathVariable("id") Long empID){
        return employeeService.deleteEmployeeById(empID);
    }

}
