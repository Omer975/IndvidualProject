/**
 * TodoList reads target text file. Add tasks to todo list, show, sort by date,
 * sort by project, edit task title, project name, task date, task status, remove task
 * and how many task have, how many task are done
 */

package ToDo;

import ToDo.DateCompare;
import ToDo.FileManagement;
import ToDo.ProjectCompare;

import java.io.IOException;
import java.util.ArrayList;
import java.util.*;

public class TodoList {
    private ArrayList<Task> tasks;
    private ArrayList<Task> tasksDone;

    public TodoList(){
        this.tasks = new ArrayList<>();
        this.tasksDone = new ArrayList<>();
    }

    /**
     *Add task to ToDo List
     */
    public void addRecord(String taskTitle, String projectName, Date taskDate, String taskStatus){

        tasks.add(new Task(taskTitle,projectName, taskDate, taskStatus));
    }

    /**
     * Display the tasks (ToDo List) data from the ArrayList
     */
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

    /**
     * Display the task from text file
     * @throws IOException
     */
    public void printListinFile() throws IOException {
        tasks = FileManagement.readFile("output.txt");
        print();
    }

    /**
     * Get list of tasks
     * @return
     */
    public ArrayList<Task> getListofTasks(){
        return tasks;
    }

    /**
     * Sort the tasks (Todo list) by task date
     */
    public void printSortbyDate(){
        Collections.sort(tasks, new DateCompare());
        print();
    }

    /**
     * Sort the tasks (Todo list) by project name
     */
    public void printSortbyProject(){
        Collections.sort(tasks, new ProjectCompare());
        print();
    }

    /**
     * Edit task title
     * @param taskTitle
     * @param newTaskTitle
     */
    public void editTaskTitle(String taskTitle, String newTaskTitle){
        tasks.stream()
                .filter(x -> x.getTaskTitle().equals(taskTitle))
                .forEach(x -> x.setTaskTitle(newTaskTitle));
    }

    /**
     * Edit project name
     * @param projectName
     * @param newProjectName
     */
    public void editProjectName(String projectName, String newProjectName){
        tasks.stream()
                .filter(x -> x.getProjectName().equals(projectName))
                .forEach(x -> x.setProjectName(newProjectName));
    }

    /**
     * Edit project date
     * @param projectName
     * @param dNew
     */
    public void editProjectDate(String projectName, Date dNew){
        tasks.stream()
                .filter(x -> x.getProjectName().equals(projectName))
                .forEach(x -> x.setTaskDate(dNew));
    }

    /**
     * Edit project status
     * @param projectName
     * @param newStatus
     */
    public void editStatus(String projectName, String newStatus){
        tasks.stream()
                .filter(x -> x.getProjectName().equals(projectName))
                .forEach(x -> x.setStatus(newStatus));
    }

    /**
     * Remove task from list
      * @param taskIndex
     */
    public void remove(int taskIndex){
        tasksDone.add(tasks.get(taskIndex-1));
        tasks.remove(taskIndex-1);
    }

    /**
     * Get the number of tasks from ArrayList
     * @return
     */
    public int taskSize(){
        return tasks.size();
    }

    /**
     * Get the number of completed tasks from ArrayList
     * @return
     */
    public int taskDoneSize(){
        return tasksDone.size();
    }
}

