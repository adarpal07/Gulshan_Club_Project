package mid.gulshan_club.HR_Manager.Model;

import java.io.Serializable;
import java.time.LocalDate;

public class Task implements Serializable {
    private String taskTitle, taskDescription, assignedTo;
    private LocalDate dueDate;

    public Task() {
    }

    public Task(String taskTitle, String taskDescription, String assignedTo, LocalDate dueDate) {
        this.taskTitle = taskTitle;
        this.taskDescription = taskDescription;
        this.assignedTo = assignedTo;
        this.dueDate = dueDate;
    }

    public String getTaskTitle() {
        return taskTitle;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public String getAssignedTo() {
        return assignedTo;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    @Override
    public String toString() {
        return "Task{" +
                "taskTitle='" + taskTitle + '\'' +
                ", taskDescription='" + taskDescription + '\'' +
                ", assignedTo='" + assignedTo + '\'' +
                ", dueDate=" + dueDate +
                '}';
    }
}
