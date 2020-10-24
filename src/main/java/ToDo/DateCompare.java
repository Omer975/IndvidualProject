/**
 * Comparing the tasks by date
 */

package ToDo;

import java.util.Comparator;

public class DateCompare implements Comparator<Task>{

    @Override
    public int compare(Task task1, Task task2) {
        return task1.getTaskDate().compareTo(task2.getTaskDate());
    }
}


