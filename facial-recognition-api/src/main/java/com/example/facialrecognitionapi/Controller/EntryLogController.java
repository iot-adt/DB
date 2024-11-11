package com.example.facialrecognitionapi.Controller;

import com.example.facialrecognitionapi.model.EntryLog;
import com.example.facialrecognitionapi.Service.EntryLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/entryLogs")
public class EntryLogController {

    @Autowired
    private EntryLogService entryLogService;

    @PostMapping("/log")
    public EntryLog logEntry(@RequestBody EntryLog entryLog) {
        return entryLogService.logEntry(entryLog);
    }

    @GetMapping("/user/{userId}")
    public List<EntryLog> getEntryLogs(@PathVariable Long userId) {
        return entryLogService.getLogsByUser(userId);
    }
}
