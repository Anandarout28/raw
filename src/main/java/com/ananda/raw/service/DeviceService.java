package com.ananda.raw.service;

import com.ananda.raw.entity.Device;
import com.ananda.raw.entity.User;
import com.ananda.raw.repository.DeviceRepository;
import org.springframework.stereotype.Service;

@Service
public class DeviceService {
    private final DeviceRepository deviceRepository;

    public DeviceService(DeviceRepository deviceRepository){

        this.deviceRepository = deviceRepository;
    }

    public  Device registerDevice(User user, String deviceName, String identityPublicKey){

        Device device = new Device(user,deviceName,identityPublicKey);

        return deviceRepository.save(device);
    }

}
