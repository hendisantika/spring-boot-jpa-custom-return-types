package id.my.hendisantika.customreturntypes.controller;

import id.my.hendisantika.customreturntypes.dto.EmployeeDTO;
import id.my.hendisantika.customreturntypes.entity.Employee;
import id.my.hendisantika.customreturntypes.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-jpa-custom-return-types
 * User: hendisantika
 * Link: s.id/hendisantika
 * Email: hendisantika@yahoo.co.id
 * Telegram : @hendisantika34
 * Date: 02/03/25
 * Time: 06.06
 * To change this template use File | Settings | File Templates.
 */
@RestController
@RequestMapping("/api/employees")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    // Get all employees
    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    // Get Employees as DTO
    @GetMapping("/dto")
    public List<EmployeeDTO> getEmployeesAsDTO(@RequestParam String department) {
        return employeeService.getEmployeesAsDTO(department);
    }
}
