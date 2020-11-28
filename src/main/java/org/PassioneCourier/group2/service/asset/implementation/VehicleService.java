package org.PassioneCourier.group2.service.asset.implementation;

import org.PassioneCourier.group2.entity.asset.Device;
import org.PassioneCourier.group2.entity.asset.Vehicle;
import org.PassioneCourier.group2.repository.asset.IDeviceRepository;
import org.PassioneCourier.group2.repository.asset.IVehicleRepository;
import org.PassioneCourier.group2.service.asset.interfaces.IVehicleService;
import org.springframework.beans.factory.annotation.Autowired;

public class VehicleService implements IVehicleService {

    @Autowired
    private IVehicleRepository repository;

    @Override
    public Vehicle create(Vehicle x) {
        return repository.save(x);
    }

    @Override
    public Vehicle read(String ID) {
        return repository.getOne(ID);
    }

    @Override
    public Vehicle update(Vehicle x, String ID) {

        //Optional<Device> n = repository.findOne(ID);
        try {
            Vehicle v = repository.getOne(ID);

            repository.deleteById(ID);
            Vehicle vu = new Vehicle.Builder().copy(v).setID(v.getID()).build();

            return repository.save(vu);

        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            return null;
        }

    }

    @Override
    public boolean delete(String ID) {

        this.repository.deleteById(ID);
        if (this.repository.existsById(ID))
            return false;
        else
            return true;
    }
}
