package com.example.facialrecognitionapi.repository;

import com.example.facialrecognitionapi.model.EntryLog;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EntryLogRepository extends JpaRepository<EntryLog, Long> {
    List<EntryLog> findByUserId(Long userId);  // 특정 사용자의 출입 기록 조회
}
