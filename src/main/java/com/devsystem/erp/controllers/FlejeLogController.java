package com.devsystem.erp.controllers;

import com.devsystem.erp.models.FlejeLog;
import com.devsystem.erp.repositories.FlejeLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/fleje-logs")
@CrossOrigin(origins = "*")
public class FlejeLogController {

    @Autowired
    private FlejeLogRepository flejeLogRepository;

    @GetMapping
    public List<FlejeLog> getAllLogs() {
        return flejeLogRepository.findAll();
    }


    @PostMapping
    public FlejeLog createLog(@RequestBody FlejeLog newLog) {
        return flejeLogRepository.save(newLog);
    }
}