package com.devsystem.erp.controllers;

import com.devsystem.erp.models.WashingService;
import com.devsystem.erp.repositories.WashingServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/washing-services")
@CrossOrigin(origins = "*")
public class WashingServiceController {

@Autowired
    private WashingServiceRepository washingServiceRepository;

@GetMapping
    public List<WashingService> getAllService() {
    return washingServiceRepository.findAll();
}

@PostMapping
    public WashingService createService(@RequestBody WashingService newService){
    return washingServiceRepository.save(newService);
}

}
