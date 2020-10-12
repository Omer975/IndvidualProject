import java.util.ArrayList;
import java.util.Scanner;
import java.text.DateFormat;
import java.util.*;

public class TodoList {
    private ArrayList<Task> tasks;
    private ArrayList<Task> tasksDone;

    public TodoList(){
        this.tasks = new ArrayList<>();
        this.tasksDone = new ArrayList<>();
    }

    public void addRecord(String taskTitle, String projectName, Date taskDate, String taskStatus){

        tasks.add(new Task(taskTitle,projectName, taskDate, taskStatus));
    }

    public void print(){
        for (Task list: tasks){
            System.out.println("__________________________________________");
            System.out.println("Task Title:     " + list.getTaskTitle());
            System.out.println("Project Name:   " + list.getProjectName());
            System.out.println("Task Date:      " + list.getTaskDate());
            System.out.println("Task Status:    " + list.getStatus());
            System.out.println("__________________________________________");

        }
    }

    public void remove(int taskIndex){

        tasksDone.add(tasks.get(taskIndex));
        tasks.remove(taskIndex);
    }


    public int taskSize(){
        return tasks.size();
    }

    public int taskDoneSize(){
        return tasksDone.size();
    }
}
