import java.util.Comparator;

public class DateCompare implements Comparator<Task>{

    @Override
    public int compare(Task task1, Task task2) {
        return task1.getTaskDate().compareTo(task2.getTaskDate());
    }

}


/*import java.util.*;

public class DateCompare {
    static class DateItem {
        Date datetime;

        DateItem(Date date) {
            this.datetime = date;
        }
    }

    static class SortByDate implements Comparator<DateItem> {
        @Override
        public int compare(DateItem a, DateItem b) {
            return a.datetime.compareTo(b.datetime);
        }
    }
}*/