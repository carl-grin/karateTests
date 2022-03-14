package com.example.karatetests.dto;

import com.example.karatetests.model.Employee;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class AllEmployeeResponseDto {

    private List<Employee> employees;
}
