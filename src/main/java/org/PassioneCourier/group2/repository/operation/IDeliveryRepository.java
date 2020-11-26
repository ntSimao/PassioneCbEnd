package org.PassioneCourier.group2.repository.operation;
import org.PassioneCourier.group2.entity.operation.Delivery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDeliveryRepository extends JpaRepository <Delivery, String>{
}
