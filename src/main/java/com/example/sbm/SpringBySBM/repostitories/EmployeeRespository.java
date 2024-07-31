package com.example.sbm.SpringBySBM.repostitories;

import com.example.sbm.SpringBySBM.entities.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRespository extends JpaRepository<EmployeeEntity,Long> {
}
