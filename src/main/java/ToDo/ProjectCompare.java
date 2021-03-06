/**
 * Comparing the tasks by project name
 */
package ToDo;

import java.util.Comparator;

public class ProjectCompare implements Comparator<Task>{

    @Override
    public int compare(Task task1, Task task2) {
        return task1.getProjectName().compareTo(task2.getProjectName());
    }
}