package org.PassioneCourier.group2.service.asset.implementation;

import org.PassioneCourier.group2.entity.asset.Device;
import org.PassioneCourier.group2.factory.asset.DeviceFactory;
import org.PassioneCourier.group2.repository.asset.IDeviceRepository;
import org.PassioneCourier.group2.repository.operation.IDeliveryRepository;
import org.PassioneCourier.group2.service.asset.interfaces.IDeviceService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class DeviceService implements IDeviceService {

    @Autowired
    private IDeviceRepository repository;

    @Override
    public Device create(Device x) {
        return repository.save(x);
    }

    @Override
    public Device read(String ID) {
        return repository.getOne(ID);
    }

    @Override
    public Device update(Device x, String ID) {


        //Optional<Device> n = repository.findOne(ID);
        Device n = repository.getOne(ID);

        repository.deleteById(ID);
        Device a = new Device.Builder().copy(n).setID(n.getID()).build();

        return repository.save(a);
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
