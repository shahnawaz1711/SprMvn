package p1.SprMvn;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@GetMapping(value = "getAllEmployee")
	public List<Employee> getAllEmployee() {
		System.out.println("Hello World..");
		return Arrays.asList(new Employee(1, "Sam", 1000),
				new Employee(2, "Pam", 2000),
				new Employee(3, "Dam", 3000));
		
	}
}
