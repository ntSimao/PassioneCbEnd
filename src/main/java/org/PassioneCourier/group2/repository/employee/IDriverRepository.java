package org.PassioneCourier.group2.repository.employee;

import org.PassioneCourier.group2.entity.employee.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDriverRepository extends JpaRepository <Driver, String>{
}
