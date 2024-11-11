package com.example.facialrecognitionapi.repository;

import com.example.facialrecognitionapi.model.UserRegistration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRegistrationRepository extends JpaRepository<UserRegistration, Long> {
    UserRegistration findByName(String name);  // 이름으로 사용자 찾기
}
