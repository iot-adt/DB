package com.example.security_system.service;

import com.example.security_system.model.AccessLog;
import com.example.security_system.repository.AccessLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccessLogService {
    @Autowired
    private AccessLogRepository repository;

    public AccessLog logAccess(AccessLog accessLog) {
        return repository.save(accessLog);
    }
}

