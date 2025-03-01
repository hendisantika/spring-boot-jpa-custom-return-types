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
            employeeRepository.save(new Employee("Itadori Yuji", "yuji@yopmail.com", "IT"));
            employeeRepository.save(new Employee("Naobara Kugisaki", "naobara@yopmail.com", "Marketing"));
            employeeRepository.save(new Employee("Megumi Fushiguro", "megumi@yopmail.com", "IT"));
            employeeRepository.save(new Employee("Satoru Gojo", "gojo@yopmail.com", "IT"));
            employeeRepository.save(new Employee("Ryoumen Sukuna", "sukuna@yopmail.com", "Sales"));
            employeeRepository.save(new Employee("Suguru Geto", "geto@yopmail.com", "Finance"));
        };
    }
}
