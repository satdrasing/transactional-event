package com.example.springeventexample;

import lombok.Builder;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;

@RestController
@RequiredArgsConstructor
@Log4j2
public class EmployeeController {


    private final ApplicationEventPublisher applicationEventPublisher;

    private final EmployeeRepository employeeRepository;



    @GetMapping
    @Transactional
    public void publishEvent(){

        applicationEventPublisher.publishEvent(SendEmailEvent.builder().build());

        Employee employee = Employee.builder()
                .empName("satendra")
                .empdept("oracle")
                .build();

        log.info("data saved");
        employeeRepository.save(employee);

    }
}
