package org.PassioneCourier.group2.repository.asset;
import org.PassioneCourier.group2.entity.asset.Device;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DeviceInterface extends JpaRepository <Device, String> {
}
