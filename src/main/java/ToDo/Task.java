/**
 * Details of Task Title, Project Name, Task Date and Task Status
 */
package ToDo;

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

    /**
     * @return the Task Title
     */
    public String getTaskTitle(){
        return taskTitle;
    }

    /**
     * @return the Project Name
     */
    public String getProjectName(){
        return projectName;
    }

    /**
     * @return the Task Date
     */
    public Date getTaskDate(){
        return taskDate;
    }

    /**
     * @return the Task Status
     */
    public String getStatus(){
        return taskStatus;
    }

    /**
     * Set or modify the Task Title
     * @param taskTitle
     */
    public void setTaskTitle(String taskTitle) {
        this.taskTitle = taskTitle;
    }

    /**
     * Set or modify the Project Name
     * @param projectName
     */
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    /**
     * Set or modify the Task Date
     * @param taskDate
     */
    public void setTaskDate(Date taskDate) {
        this.taskDate = taskDate;
    }

    /**
     * Set or modify the Task Status
     * @param status
     */
    public void setStatus(String status) {
        this.taskStatus = status;
    }
}
