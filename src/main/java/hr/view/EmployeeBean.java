package hr.view;

import hr.entity.Employee;
import hr.repository.EmployeeRepository;
import org.springframework.web.context.annotation.RequestScope;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
@RequestScope
public class EmployeeBean {

    @Inject
    private EmployeeRepository repository;

    public List<Employee> getEmployees() {
        return repository.findAll();
    }
}
