package org.PassioneCourier.group2.service.asset.implementation;

import org.PassioneCourier.group2.entity.asset.Vehicle;
import org.PassioneCourier.group2.repository.asset.IVehicleRepository;
import org.PassioneCourier.group2.service.asset.interfaces.IVehicleService;
import org.springframework.beans.factory.annotation.Autowired;

public class VehicleService implements IVehicleService {

    @Autowired
    private IVehicleRepository repository;

    @Override
    public Vehicle create(Vehicle x) {
        return null;
    }

    @Override
    public Vehicle read(String ID) {
        return null;
    }

    @Override
    public Vehicle update(Vehicle x, String ID) {
        return null;
    }

    @Override
    public boolean delete(String ID) {
        return false;
    }
}
