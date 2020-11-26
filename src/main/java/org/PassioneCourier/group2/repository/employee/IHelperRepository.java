package org.PassioneCourier.group2.repository.employee;
import org.PassioneCourier.group2.entity.employee.Helper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHelperRepository extends JpaRepository <Helper, String> {
}
