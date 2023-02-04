package org.swing.app.dto.todotask;

import java.time.LocalDateTime;

public class TodoTaskDTO {

    private String id;
    private String todoListId;
    private String name;
    private boolean importantFlag;
    private LocalDateTime deadline;
    private byte completePercent;
    private LocalDateTime completedDateTime;
    private String note;
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

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
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
