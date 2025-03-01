# spring-boot-jpa-custom-return-types

    ✅ DTO Projections – Fetch only required fields for better performance.
    ✅ Interface-based Projections – Use lightweight projections without extra classes.
    ✅ Dynamic Projections – Choose return types at runtime.
    ✅ Streams – Efficiently handle large datasets.

### Things to do list:

1. Clone this repository: `git clone https://github.com/hendisantika/spring-boot-jpa-custom-return-types.git'
2. Navigate to the folder: `cd spring-boot-jpa-custom-return-types`
3. Run the application: `mvn clean spring-boot:run`
4. Open your favorite browser: http://localhost:8080/api/employees
5. Check the result and test on custom_return_type.http file

✅ Get All Employees (Entity)

GET http://localhost:9080/api/employees

✅ Get Employees as DTO

GET http://localhost:9080/api/employees/dto?department=IT

✅ Get Employees as Projection

GET http://localhost:9080/api/employees/projection?department=IT

✅ Get Employees as Stream

GET http://localhost:9080/api/employees/stream?department=IT
