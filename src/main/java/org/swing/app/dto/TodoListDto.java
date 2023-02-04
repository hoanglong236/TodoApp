package org.swing.app.dto;

import java.time.LocalDateTime;

public class TodoListDto {

    private String id;
    private String name;
    private boolean completeFlag;
    private LocalDateTime completedDateTime;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private CompletionRate taskCompletionRate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getCompleteFlag() {
        return completeFlag;
    }

    public void setCompleteFlag(boolean completeFlag) {
        this.completeFlag = completeFlag;
    }

    public LocalDateTime getCompletedDateTime() {
        return completedDateTime;
    }

    public void setCompletedDateTime(LocalDateTime completedDateTime) {
        this.completedDateTime = completedDateTime;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public CompletionRate getTaskCompletionRate() {
        return taskCompletionRate;
    }

    public void setTaskCompletionRate(CompletionRate taskCompletionRate) {
        this.taskCompletionRate = taskCompletionRate;
    }
}
