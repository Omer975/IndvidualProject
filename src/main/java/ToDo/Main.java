package ToDo;

import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        // Here you can try out the combined functionality of your classes
        TodoList list = new TodoList();
        Scanner scanner = new Scanner(System.in);
        UserInterface ui = new UserInterface(list, scanner);

        ui.start();


    }
}