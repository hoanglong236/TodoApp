package org.swing.app.dto.todotask;

import java.time.LocalDateTime;

public class TodoTaskInsertDTO {

    private String todoListId;
    private String name;
    private boolean importantFlag;
    private LocalDateTime deadline;
    private String note;

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

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
