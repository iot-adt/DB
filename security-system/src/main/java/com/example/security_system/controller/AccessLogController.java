package com.example.security_system.controller;

import com.example.security_system.model.AccessLog;
import com.example.security_system.service.AccessLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/access")
public class AccessLogController {
    @Autowired
    private AccessLogService service;

    @PostMapping("/log")
    public AccessLog logAccess(@RequestBody AccessLog accessLog) {
        return service.logAccess(accessLog);
    }
}

