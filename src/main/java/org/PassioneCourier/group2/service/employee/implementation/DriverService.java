package org.PassioneCourier.group2.service.employee.implementation;

import org.PassioneCourier.group2.entity.employee.Driver;
import org.PassioneCourier.group2.repository.employee.IDriverRepository;
import org.PassioneCourier.group2.service.employee.interfaces.IDriverService;
import org.springframework.beans.factory.annotation.Autowired;

public class DriverService implements IDriverService {

    @Autowired
    private IDriverRepository repository;

    @Override
    public Driver create(Driver x) {
        return null;
    }

    @Override
    public Driver read(String ID) {
        return null;
    }

    @Override
    public Driver update(Driver x, String ID) {
        return null;
    }

    @Override
    public boolean delete(String ID) {
        return false;
    }
}
