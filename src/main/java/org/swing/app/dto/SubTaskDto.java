package org.swing.app.dto;

public class SubTaskDto {

    private String taskId;
    private byte completePercent;
    private boolean importantFlag;

    public SubTaskDto() {
        super();
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public byte getCompletePercent() {
        return completePercent;
    }

    public void setCompletePercent(byte completePercent) {
        this.completePercent = completePercent;
    }

    public boolean getImportantFlag() {
        return importantFlag;
    }

    public void setImportantFlag(boolean importantFlag) {
        this.importantFlag = importantFlag;
    }
}
