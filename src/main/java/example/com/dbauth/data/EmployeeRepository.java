package example.com.dbauth.data;

import java.util.Date;
import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import example.com.dbauth.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	List<Employee> findByFirstName(String firstName);

	List<Employee> findByFirstNameAndLastName(String firstName, String lastName);

	List<Employee> findByBirthDateAfter(Date date, Pageable page);

	Employee findFirstByFirstName(String firstName);

	List<Employee> findByFirstNameContainingIgnoreCase(String letter, Pageable page);

	List<Employee> findByFirstNameContainingIgnoreCase(String letter);

	List<Employee> findByLastName(String lastName);

	List<Employee> findTop100By();

	@Transactional
	void deleteByEmpNo(Integer empNo);

}
