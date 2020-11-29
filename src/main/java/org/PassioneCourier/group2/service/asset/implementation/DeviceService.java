package org.PassioneCourier.group2.service.asset.implementation;

import org.PassioneCourier.group2.entity.asset.Device;
import org.PassioneCourier.group2.repository.asset.IDeviceRepository;
import org.PassioneCourier.group2.service.asset.IDeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeviceService implements IDeviceService {

    @Autowired
    private IDeviceRepository deviceRepository;

    @Override
    public Device create(Device x) {
        return deviceRepository.save(x);
    }

    @Override
    public Device read(String ID) {
        return deviceRepository.getOne(ID);
    }

    @Override
    public Device update(Device x, String ID) {


        //Optional<Device> n = repository.findOne(ID);

        try {
            Device n = deviceRepository.getOne(ID);

            deviceRepository.deleteById(ID);
            Device a = new Device.Builder().copy(n).setID(n.getID()).build();

            return deviceRepository.save(a);

        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean delete(String ID) {

       this.deviceRepository.deleteById(ID);
       if (this.deviceRepository.existsById(ID))
           return false;
       else
           return true;
    }
}
