package com.unicauca.architecture_hexagonal.infrastructure.entities;

import com.unicauca.architecture_hexagonal.domain.models.Task;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class TaskEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String title;

    private String description;

    private LocalDateTime createdAt;

    private boolean completed;

    public TaskEntity() {
    }

    public TaskEntity(String title, String description, LocalDateTime createdAt, boolean completed) {
        this.title = title;
        this.description = description;
        this.createdAt = createdAt;
        this.completed = completed;
    }

    public static TaskEntity toDomain(Task task) {
        return new TaskEntity(task.getTitle(), task.getDescription(), task.getCreationDate(), task.isComplete());
    }

    public Task toEntity() {
        return new Task(id, title, description, createdAt, completed);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
