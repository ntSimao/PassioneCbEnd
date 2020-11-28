package org.PassioneCourier.group2.service.employee.implementation;

import org.PassioneCourier.group2.entity.asset.Vehicle;
import org.PassioneCourier.group2.entity.employee.Driver;
import org.PassioneCourier.group2.repository.employee.IDriverRepository;
import org.PassioneCourier.group2.service.employee.interfaces.IDriverService;
import org.springframework.beans.factory.annotation.Autowired;

public class DriverService implements IDriverService {

    @Autowired
    private IDriverRepository repository;

    @Override
    public Driver create(Driver x) {
        return repository.save(x);
    }

    @Override
    public Driver read(String ID) {
        return repository.getOne(ID);
    }

    @Override
    public Driver update(Driver x, String ID) {

        //Optional<Device> n = repository.findOne(ID);
        try {
            Driver d = repository.getOne(ID);

            repository.deleteById(ID);
            Driver du = new Driver.Builder().copy(d).setDriverID(d.getDriverID()).build();

            return repository.save(du);

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
