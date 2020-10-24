package ToDo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {


    @Test
    /**
     * Verifying whether correct taskTitle has been loaded into the ArrayList
     */
    void getTaskTitle() {
        Task task1 = new Task("TaskTitle1","ProjectName1",DateFormat.stringToDate("2020-10-25") , "Open");
        assertEquals("TaskTitle1", task1.getTaskTitle());
    }

    @Test
    /**
     * Verifying whether correct projectName has been loaded into the ArrayList
     */
    void getProjectName() {
        Task task1 = new Task("TaskTitle1","ProjectName1",DateFormat.stringToDate("2020-10-25") , "Open");
        assertEquals("ProjectName1", task1.getProjectName());
    }

    @Test
    /**
     * Verifying whether correct taskDate has been loaded into the ArrayList
     */
    void getTaskDate() {
        Task task1 = new Task("TaskTitle1","ProjectName1",DateFormat.stringToDate("2020-10-25") , "Open");
        assertEquals(DateFormat.stringToDate("2020-10-25"), task1.getTaskDate());
    }

    @Test
    /**
     * Verifying whether correct taskStatus has been loaded into the ArrayList
     */
    void getStatus() {
        Task task1 = new Task("TaskTitle1","ProjectName1",DateFormat.stringToDate("2020-10-25") , "Open");
        assertEquals("Open", task1.getStatus());
    }

    @Test
    /**
     * Checking the set method for taskTitle gives expected result in the ArrayList
     */
    void setTaskTitle() {
        Task task1 = new Task("TaskTitle1","ProjectName1",DateFormat.stringToDate("2020-10-25") , "Open");
        assertEquals("TaskTitle1", task1.getTaskTitle());
        task1.setTaskTitle("TaskTitleNew");
        assertEquals("TaskTitleNew", task1.getTaskTitle());
    }

    @Test
    /**
     * Checking the set method for projectName gives expected result in the ArrayList
     */
    void setProjectName() {
        Task task1 = new Task("TaskTitle1","ProjectName1",DateFormat.stringToDate("2020-10-25") , "Open");
        assertEquals("ProjectName1", task1.getProjectName());
        task1.setProjectName("ProjectNameNew");
        assertEquals("ProjectNameNew", task1.getProjectName());
    }

    @Test
    /**
     * Checking the set method for taskDate gives expected result in the ArrayList
     */
    void setTaskDate() {
        Task task1 = new Task("TaskTitle1","ProjectName1",DateFormat.stringToDate("2020-10-25") , "Open");
        assertEquals(DateFormat.stringToDate("2020-10-25"), task1.getTaskDate());
        task1.setTaskDate(DateFormat.stringToDate("2020-10-28"));
        assertEquals(DateFormat.stringToDate("2020-10-28"), task1.getTaskDate());
    }

    @Test
    /**
     * Checking the set method for taskStatus gives expected result in the ArrayList
     */
    void setStatus() {
        Task task1 = new Task("TaskTitle1","ProjectName1",DateFormat.stringToDate("2020-10-25") , "Open");
        assertEquals("Open", task1.getStatus());
        task1.setStatus("Close");
        assertEquals("Close", task1.getStatus());
    }
}