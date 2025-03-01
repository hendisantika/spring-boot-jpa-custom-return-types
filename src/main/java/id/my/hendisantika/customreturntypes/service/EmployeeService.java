package id.my.hendisantika.customreturntypes.service;

import id.my.hendisantika.customreturntypes.dto.EmployeeDTO;
import id.my.hendisantika.customreturntypes.entity.Employee;
import id.my.hendisantika.customreturntypes.projection.EmployeeProjection;
import id.my.hendisantika.customreturntypes.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-jpa-custom-return-types
 * User: hendisantika
 * Link: s.id/hendisantika
 * Email: hendisantika@yahoo.co.id
 * Telegram : @hendisantika34
 * Date: 02/03/25
 * Time: 06.04
 * To change this template use File | Settings | File Templates.
 */
@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    // Get All Employees
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    // Get Employees as DTO
    public List<EmployeeDTO> getEmployeesAsDTO(String department) {
        return employeeRepository.findEmployeeDTOByDepartment(department);
    }

    // Get Employees as Projection
    public List<EmployeeProjection> getEmployeesAsProjection(String department) {
        return employeeRepository.findByDepartmentOrderByNameAsc(department);
    }

    // Get Employees as Stream
    @Transactional(readOnly = true)
    public List<EmployeeDTO> getEmployeesAsStream(String department) {
        try (var stream = employeeRepository.streamByDepartment(department)) {
            return stream.map(emp -> new EmployeeDTO(emp.getName(), emp.getEmail()))
                    .collect(Collectors.toList());
        }
    }
}
