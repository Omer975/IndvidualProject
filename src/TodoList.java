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
        int count = 0;
        for (Task list: tasks){
            System.out.println("__________________________________________");
            System.out.println("Task ID:        " + (count + 1));
            System.out.println("Task Title:     " + list.getTaskTitle());
            System.out.println("Project Name:   " + list.getProjectName());
            System.out.println("Task Date:      " + list.getTaskDate());
            System.out.println("Task Status:    " + list.getStatus());
            System.out.println("__________________________________________");
            count++;

        }
    }

    public void printSortbyDate(){
        Collections.sort(tasks, new DateCompare());
        print();
    }

    public void printSortbyProject(){
        Collections.sort(tasks, new ProjectCompare());
        print();
    }

    public void editTaskTitle(String taskTitle, String newTaskTitle){
        tasks.stream()
                .filter(x -> x.getTaskTitle().equals(taskTitle))
                .forEach(x -> x.setTaskTitle(newTaskTitle));
    }

    public void editProjectName(String projectName, String newProjectName){
        tasks.stream()
                .filter(x -> x.getProjectName().equals(projectName))
                .forEach(x -> x.setProjectName(newProjectName));
    }

    public void editProjectDate(String projectName, Date dNew){
        tasks.stream()
                .filter(x -> x.getProjectName().equals(projectName))
                .forEach(x -> x.setTaskDate(dNew));
    }

    public void editStatus(String projectName, String newStatus){
        tasks.stream()
                .filter(x -> x.getProjectName().equals(projectName))
                .forEach(x -> x.setStatus(newStatus));
    }

    public void remove(int taskIndex){

        tasksDone.add(tasks.get(taskIndex-1));
        tasks.remove(taskIndex-1);
    }

    public int taskSize(){
        return tasks.size();
    }

    public int taskDoneSize(){
        return tasksDone.size();
    }
}

