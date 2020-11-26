package org.PassioneCourier.group2.repository.asset;

import org.PassioneCourier.group2.entity.asset.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleInterface extends JpaRepository <Vehicle, String> {
}
