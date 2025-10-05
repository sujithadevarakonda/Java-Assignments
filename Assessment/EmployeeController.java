package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Employee;
import java.util.List;
import java.util.Arrays;
@RestController
public class EmployeeController {
    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return Arrays.asList(
                new Employee(1, "Sujitha", "HR"),
                new Employee(2, "Nazma", "Finance"),
                new Employee(3, "chaaru", "IT")
        );
    }
}
