import java.util.ArrayList;
import java.util.Scanner;
import java.text.DateFormat;
import java.util.*;

public class TodoList {
    private ArrayList<Task> tasks;
    private ArrayList<String> listDone;

    public TodoList(){
        this.tasks = new ArrayList<>();
        this.listDone = new ArrayList<>();
    }

    public void addRecord(String taskTitle, String projectName, Date taskDate, String taskStatus){

        tasks.add(new Task(taskTitle,projectName, taskDate, taskStatus));
    }

    public void print(){
        for (Task list: tasks){
            System.out.println(list.getTaskTitle());
            System.out.println(list.getProjectName());
            System.out.println(list.getTaskDate());
            System.out.println(list.getStatus());

        }
    }

    /*public void remove(int number){
        listDone.add(lists.get(number-1));
        lists.remove(number-1);

    }

    public int listSize(){
        return lists.size();
    }

    public int listDoneSize(){
        return listDone.size();
    }*/
}
