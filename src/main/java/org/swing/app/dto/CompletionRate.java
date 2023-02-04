package org.swing.app.dto;

public class CompletionRate {

    private int completedCount;
    private int totalCount;

    public CompletionRate(int completedCount, int totalCount) {
        this.completedCount = completedCount;
        this.totalCount = totalCount;
    }

    public int getCompletedCount() {
        return completedCount;
    }

    public void setCompletedCount(int completedCount) {
        this.completedCount = completedCount;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public String toString() {
        final StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(this.completedCount);
        stringBuilder.append(" / ");
        stringBuilder.append(this.totalCount);

        return stringBuilder.toString();
    }
}
