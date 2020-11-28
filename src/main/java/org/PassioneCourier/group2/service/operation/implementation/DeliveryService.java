package org.PassioneCourier.group2.service.operation.implementation;

import org.PassioneCourier.group2.entity.operation.Delivery;
import org.PassioneCourier.group2.repository.asset.IDeviceRepository;
import org.PassioneCourier.group2.service.operation.interfaces.IDeliveryService;
import org.springframework.beans.factory.annotation.Autowired;

public class DeliveryService implements IDeliveryService {

    @Autowired
    private IDeviceRepository repository;

    @Override
    public Delivery create(Delivery x) {
        return null;
    }

    @Override
    public Delivery read(String ID) {
        return null;
    }

    @Override
    public Delivery update(Delivery x, String ID) {
        return null;
    }

    @Override
    public boolean delete(String ID) {
        return false;
    }
}
