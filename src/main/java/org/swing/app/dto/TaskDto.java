package org.swing.app.dto;

import java.time.LocalDateTime;

public class TaskDto {

    private String id;
    private String todoListId;
    private String name;
    private boolean importantFlag;
    private LocalDateTime deadline;
    private byte completePercent;
    private LocalDateTime completedDateTime;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTodoListId() {
        return todoListId;
    }

    public void setTodoListId(String todoListId) {
        this.todoListId = todoListId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getImportantFlag() {
        return importantFlag;
    }

    public void setImportantFlag(boolean importantFlag) {
        this.importantFlag = importantFlag;
    }

    public LocalDateTime getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDateTime deadline) {
        this.deadline = deadline;
    }

    public byte getCompletePercent() {
        return completePercent;
    }

    public void setCompletePercent(byte completePercent) {
        this.completePercent = completePercent;
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
}
