package com.example.facialrecognitionapi.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "user_registration")
public class UserRegistration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    private String name;
    private String photoPath;
    private LocalDateTime accessStart;
    private LocalDateTime accessEnd;
    private LocalDateTime registeredAt = LocalDateTime.now();

    // Getters and Setters
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhotoPath() {
        return photoPath;
    }

    public void setPhotoPath(String photoPath) {
        this.photoPath = photoPath;
    }

    public LocalDateTime getAccessStart() {
        return accessStart;
    }

    public void setAccessStart(LocalDateTime accessStart) {
        this.accessStart = accessStart;
    }

    public LocalDateTime getAccessEnd() {
        return accessEnd;
    }

    public void setAccessEnd(LocalDateTime accessEnd) {
        this.accessEnd = accessEnd;
    }

    public LocalDateTime getRegisteredAt() {
        return registeredAt;
    }

    public void setRegisteredAt(LocalDateTime registeredAt) {
        this.registeredAt = registeredAt;
    }
}
