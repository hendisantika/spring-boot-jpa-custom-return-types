package id.my.hendisantika.customreturntypes.repository;

import id.my.hendisantika.customreturntypes.dto.EmployeeDTO;
import id.my.hendisantika.customreturntypes.entity.Employee;
import id.my.hendisantika.customreturntypes.projection.EmployeeProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Stream;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-jpa-custom-return-types
 * User: hendisantika
 * Link: s.id/hendisantika
 * Email: hendisantika@yahoo.co.id
 * Telegram : @hendisantika34
 * Date: 02/03/25
 * Time: 06.03
 * To change this template use File | Settings | File Templates.
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    // Default Entity Return
    List<Employee> findByDepartment(String department);

    // DTO Projection
    @Query("SELECT new id.my.hendisantika.customreturntypes.dto.EmployeeDTO(e.name, e.email) FROM Employee e WHERE e.department = :department")
    List<EmployeeDTO> findEmployeeDTOByDepartment(String department);

    // Interface-based Projection
    List<EmployeeProjection> findByDepartmentOrderByNameAsc(String department);

    // Dynamic Projection
    <T> List<T> findByDepartment(String department, Class<T> type);

    // Stream (Large Dataset Handling)
    Stream<Employee> streamByDepartment(String department);
}
