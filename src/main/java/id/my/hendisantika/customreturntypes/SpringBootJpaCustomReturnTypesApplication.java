package id.my.hendisantika.customreturntypes;

import id.my.hendisantika.customreturntypes.entity.Employee;
import id.my.hendisantika.customreturntypes.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootJpaCustomReturnTypesApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootJpaCustomReturnTypesApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(EmployeeRepository employeeRepository) {
        return (args) -> {
            employeeRepository.save(new Employee(1L, "Itadori Yuji", "yuji@yopmail.com", "IT"));
            employeeRepository.save(new Employee(2L, "Naobara Kugisaki", "naobara@yopmail.com", "Marketing"));
            employeeRepository.save(new Employee(3L, "Megumi Fushiguro", "megumi@yopmail.com", "IT"));
            employeeRepository.save(new Employee(4L, "Satoru Gojo", "gojo@yopmail.com", "IT"));
            employeeRepository.save(new Employee(5L, "Ryoumen Sukuna", "sukuna@yopmail.com", "Sales"));
            employeeRepository.save(new Employee(5L, "Suguru Geto", "geto@yopmail.com", "Finance"));
        };
    }
}
