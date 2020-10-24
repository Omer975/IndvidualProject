package ToDo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import ToDo.DateCompare;
import ToDo.FileManagement;
import ToDo.ProjectCompare;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.*;

class TodoListTest {
    ArrayList<Task> tasks = new ArrayList<>();;
    ArrayList<Task> tasksDone = new ArrayList<>();
    Date taskDate;

    @BeforeEach
    /**
     * Adding Todo list informations to ArrayList
     */
    void setup(){
        Task task1 = new Task("TaskTitle1","ProjectName1",DateFormat.stringToDate("2020-10-25") , "Open");
        Task task2 = new Task("TaskTitle2","ProjectName2",DateFormat.stringToDate("2020-11-25") , "Open");
        Task task3 = new Task("TaskTitle3","ProjectName3",DateFormat.stringToDate("2020-12-25") , "Open");
        tasks.add(task1);
        tasks.add(task2);
        tasks.add(task3);
    }

    @Test
    /**
     * Adding an element to ArrayList (ToDoList) and testing it.
     */
    void addRecord() {
        Date date = DateFormat.stringToDate("2020-10-25");
        assertEquals("TaskTitle1", tasks.get(0).getTaskTitle());
        assertEquals("ProjectName1", tasks.get(0).getProjectName());
        assertEquals(date.toString(), tasks.get(0).getTaskDate().toString());
        assertEquals("Open", tasks.get(0).getStatus());
    }

    @Test
    /**
     * Checking whether the ArrayList (ToDoList) sorted by Date
     */
    void printSortbyDate() {
        ArrayList<Task> sorted = new ArrayList<>(tasks);
        sorted.sort((Task d1, Task d2) -> d1.getTaskDate().compareTo(d2.getTaskDate()));
        assertEquals(sorted.get(0).getTaskDate(), tasks.get(0).getTaskDate());
    }

    @Test
    /**
     * Checking the ArrayList (ToDoList) sorted by Project
     */
    void printSortbyProject() {
        ArrayList<Task> sorted = new ArrayList<>(tasks);
        sorted.sort((Task p1, Task p2) -> p1.getTaskDate().compareTo(p2.getTaskDate()));
        assertEquals(sorted.get(0).getProjectName(), tasks.get(0).getProjectName());
    }

    @Test
    /**
     * Testing for change the ArrayList (ToDo List) taskTitle.
     */
    void editTaskTitle() {
        Task task1 = new Task("TaskTitle1","ProjectName1",DateFormat.stringToDate("2020-10-25") , "Open");
        task1.setTaskTitle("TaskTitleNew");
        assertEquals("TaskTitleNew", task1.getTaskTitle());
    }

    @Test
    /**
     * Testing for change the ArrayList (ToDo List) projectName.
     */
    void editProjectName() {
        Task task1 = new Task("TaskTitle1","ProjectName1",DateFormat.stringToDate("2020-10-25") , "Open");
        task1.setProjectName("ProjectNameNew");
        assertEquals("ProjectNameNew", task1.getProjectName());

    }

    @Test
    /**
     * Testing for change the ArrayList (ToDo List) taskDate.
     */
    void editProjectDate() {
        Task task1 = new Task("TaskTitle1","ProjectName1",DateFormat.stringToDate("2020-10-25") , "Open");
        task1.setTaskDate(DateFormat.stringToDate("2020-10-28"));
        assertEquals(DateFormat.stringToDate("2020-10-28"), task1.getTaskDate());
    }

    @Test
    /**
     * Testing for change the ArrayList (ToDo List) editStatus.
     */
    void editStatus() {
        Task task1 = new Task("TaskTitle1","ProjectName1",DateFormat.stringToDate("2020-10-25") , "Open");
        task1.setStatus("Close");
        assertEquals("Close", task1.getStatus());
    }

    @Test
    /**
     * Check the elements successfully removed from ArrayList
     */
    void remove() {
        tasks.remove(2);
        assertEquals(2,tasks.size());
    }

    @Test
    /**
     * Checking the how many elements (ToDoList) has in ArrayList
     */
    void taskSize() {
        assertEquals(3, tasks.size());
    }

    @Test
    /**
     * Checking the how many elements (ToDoList tasks are done) removed from ArrayList and added to tasksDone list
     */
    void taskDoneSize() {
        tasksDone.add(tasks.get(2));
        tasks.remove(2);
        assertEquals(1, tasksDone.size());
    }
}