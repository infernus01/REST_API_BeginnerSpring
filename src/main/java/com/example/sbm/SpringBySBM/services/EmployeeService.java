package com.example.sbm.SpringBySBM.services;

import com.example.sbm.SpringBySBM.dto.EmployeeDTO;
import com.example.sbm.SpringBySBM.entities.EmployeeEntity;
import com.example.sbm.SpringBySBM.repostitories.EmployeeRespository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeService {
    final EmployeeRespository employeeRepo;
    final ModelMapper modelMapper;

    public EmployeeService(EmployeeRespository employeeRepo, ModelMapper modelMapper) {
        this.employeeRepo = employeeRepo;
        this.modelMapper = modelMapper;
    }

    public EmployeeDTO getEmployeeByID(Long id){
        EmployeeEntity employeeEntity=employeeRepo.getById(id);
        return modelMapper.map(employeeEntity,EmployeeDTO.class);
    }

    public EmployeeDTO createNewEmployee(EmployeeDTO employeeDTO) {
        EmployeeEntity employeeEntity=modelMapper.map(employeeDTO,EmployeeEntity.class);
        return modelMapper.map(employeeRepo.save(employeeEntity),EmployeeDTO.class);
    }

    public List<EmployeeDTO> getAllEmployees() {
        return employeeRepo.findAll().stream().map(employeeEntity -> modelMapper.map(employeeEntity,EmployeeDTO.class)).collect(Collectors.toList());

    }

    public boolean deleteEmployeeById(Long empID) {
        boolean isPresent=employeeRepo.existsById(empID);
        if(isPresent){
            employeeRepo.deleteById(empID);
            return true;
        }
        return false;
    }
}
