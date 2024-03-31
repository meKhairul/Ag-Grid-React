package com.khairul82.SpringCrudSQL.controller;

import com.khairul82.SpringCrudSQL.model.User;
import com.khairul82.SpringCrudSQL.model.WearableDevice;
import com.khairul82.SpringCrudSQL.repository.WearableDeviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000/")
public class WearableDeviceController {
    @Autowired
    private WearableDeviceRepository wearableDeviceRepository;

    @PostMapping("/wearable")
    WearableDevice newWearableDevice(@RequestBody WearableDevice newWearableDevice)
    {
        return wearableDeviceRepository.save(newWearableDevice);
    }
    @GetMapping("/wearables")
    List<WearableDevice> getAllWearableDevice()
    {
        return  wearableDeviceRepository.findAll();
    }
}
