package org.swing.app.dto.todotask;

import java.time.LocalDateTime;

public class TodoTaskUpdateDTO {

    private String id;
    private String name;
    private boolean importantFlag;
    private LocalDateTime deadline;
    private String note;
    private byte completePercent;
    private LocalDateTime completedDateTime;

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

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
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
}
