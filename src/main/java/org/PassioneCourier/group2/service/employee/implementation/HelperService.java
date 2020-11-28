package org.PassioneCourier.group2.service.employee.implementation;

import org.PassioneCourier.group2.entity.employee.Helper;
import org.PassioneCourier.group2.repository.employee.IHelperRepository;
import org.PassioneCourier.group2.service.employee.interfaces.IHelperService;
import org.springframework.beans.factory.annotation.Autowired;

public class HelperService implements IHelperService {

    @Autowired
    private IHelperRepository repository;

    @Override
    public Helper create(Helper x) {
        return null;
    }

    @Override
    public Helper read(String ID) {
        return null;
    }

    @Override
    public Helper update(Helper x, String ID) {
        return null;
    }

    @Override
    public boolean delete(String ID) {
        return false;
    }
}
