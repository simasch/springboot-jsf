package hr.view;

import hr.entity.Employee;
import hr.repository.EmployeeRepository;
import org.springframework.web.context.annotation.RequestScope;

import javax.inject.Named;
import java.util.List;

@Named
@RequestScope
public class EmployeeBean {

    private final EmployeeRepository repository;

    public EmployeeBean(EmployeeRepository repository) {
        this.repository = repository;
    }

    public List<Employee> getEmployees() {
        return repository.findAll();
    }
}
