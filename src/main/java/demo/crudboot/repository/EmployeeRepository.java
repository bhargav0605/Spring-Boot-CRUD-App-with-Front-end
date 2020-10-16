package demo.crudboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.crudboot.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
