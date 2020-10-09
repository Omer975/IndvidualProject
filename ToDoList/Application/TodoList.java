import java.util.ArrayList;
import java.util.Scanner;
public class TodoList {
    private ArrayList<String> lists;
    private ArrayList<String> listDone;

    public TodoList(){
        this.lists = new ArrayList<>();
        this.listDone = new ArrayList<>();
    }

    public void add(String task){
        lists.add(task);
    }

    public void print(){
        int i=1;
        for (String list: lists){
            System.out.println(i+": " + list);
            i++;
        }
    }

    public void remove(int number){
        listDone.add(lists.get(number-1));
        lists.remove(number-1);

    }

    public int listSize(){
        return lists.size();
    }

    public int listDoneSize(){
        return listDone.size();
    }
}
