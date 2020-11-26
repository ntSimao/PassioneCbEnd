package org.PassioneCourier.group2.repository.asset;
import org.PassioneCourier.group2.entity.asset.Device;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDeviceRepository extends JpaRepository <Device, String> {
}
