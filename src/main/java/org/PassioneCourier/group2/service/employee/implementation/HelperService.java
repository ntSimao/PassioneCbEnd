package org.PassioneCourier.group2.service.employee.implementation;

import org.PassioneCourier.group2.entity.employee.Driver;
import org.PassioneCourier.group2.entity.employee.Helper;
import org.PassioneCourier.group2.repository.employee.IHelperRepository;
import org.PassioneCourier.group2.service.employee.interfaces.IHelperService;
import org.springframework.beans.factory.annotation.Autowired;

public class HelperService implements IHelperService {

    @Autowired
    private IHelperRepository repository;

    @Override
    public Helper create(Helper x) {
        return repository.save(x);
    }

    @Override
    public Helper read(String ID) {
        return repository.getOne(ID);
    }

    @Override
    public Helper update(Helper x, String ID) {

        //Optional<Device> n = repository.findOne(ID);
        try {
            Helper h = repository.getOne(ID);

            repository.deleteById(ID);
            Helper hu = new Helper.Builder().copy(h).setHelperID(h.getHelperID()).build();

            return repository.save(hu);

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
