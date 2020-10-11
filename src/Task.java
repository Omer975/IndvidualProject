import java.util.Comparator;
import java.util.*;

public class Task {
    private String taskTitle;
    private String projectName;
    private Date taskDate;
    private String taskStatus;

    public Task(String taskTitle, String projectName, Date taskDate, String status) {
        this.taskTitle = taskTitle;
        this.projectName = projectName;
        this.taskDate = taskDate;
        this.taskStatus = status;
    }

    public String getTaskTitle(){
        return taskTitle;
    }

    public String getProjectName(){
        return projectName;
    }

    public Date getTaskDate(){
        return taskDate;
    }

    public String getStatus(){
        return taskStatus;
    }

    public void setTaskTitle(String taskTitle) {
        this.taskTitle = taskTitle;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public void setTaskDate(Date taskDate) {
        this.taskDate = taskDate;
    }

    public void setStatus(String status) {
        this.taskStatus = status;
    }
}
