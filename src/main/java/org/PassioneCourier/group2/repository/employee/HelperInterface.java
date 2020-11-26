package org.PassioneCourier.group2.repository.employee;
import org.PassioneCourier.group2.entity.employee.Helper;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HelperInterface extends JpaRepository <Helper, String> {
}
