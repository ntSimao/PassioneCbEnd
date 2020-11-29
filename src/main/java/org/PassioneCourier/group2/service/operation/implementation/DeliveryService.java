package org.PassioneCourier.group2.service.operation.implementation;

import org.PassioneCourier.group2.entity.operation.Delivery;
import org.PassioneCourier.group2.repository.operation.IDeliveryRepository;
import org.PassioneCourier.group2.service.operation.IDeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeliveryService implements IDeliveryService {

    @Autowired
    private IDeliveryRepository repository;

    @Override
    public Delivery create(Delivery x) {
        return repository.save(x);
    }

    @Override
    public Delivery read(String ID) {
        return repository.getOne(ID);
    }

    @Override
    public Delivery update(Delivery x, String ID) {

        //Optional<Device> n = repository.findOne(ID);
        try {
            Delivery d = repository.getOne(ID);

            repository.deleteById(ID);
            Delivery du = new Delivery.Builder().copy(d).setDeliveryNo(d.getDeliveryNo()).build();

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
