package com.example.facialrecognitionapi.Service;

import com.example.facialrecognitionapi.model.EntryLog;
import com.example.facialrecognitionapi.repository.EntryLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntryLogService {

    @Autowired
    private EntryLogRepository entryLogRepository;

    public EntryLog logEntry(EntryLog entryLog) {
        return entryLogRepository.save(entryLog);
    }

    public List<EntryLog> getLogsByUser(Long userId) {
        return entryLogRepository.findByUserId(userId);
    }
}
