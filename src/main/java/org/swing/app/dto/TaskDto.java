package org.swing.app.dto;

public class TaskDto extends TaskBaseDto {

    private boolean completeFlag;

    public TaskDto() {
        super();
    }

    public boolean getCompleteFlag() {
        return completeFlag;
    }

    public void setCompleteFlag(boolean completeFlag) {
        this.completeFlag = completeFlag;
    }
}
