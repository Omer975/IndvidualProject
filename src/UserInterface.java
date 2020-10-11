import java.util.Scanner;
public class UserInterface {
    private TodoList todoList;
    private Scanner scanner;

    public UserInterface(TodoList todoList, Scanner scanner){
        this.todoList = todoList;
        this.scanner = scanner;
    }

    public void start(){
        while(true){
            System.out.println();
            System.out.println("Welcome to ToDoList");
            System.out.println("You have "+ this.todoList.listSize() + " tasks todo and " + this.todoList.listDoneSize()+ " tasks are done!");
            System.out.println("Pick an Option: ");
            System.out.println("(1) Show task list (by date or project)");
            System.out.println("(2) Add New Task");
            System.out.println("(3) Edit Task (Update, Mark as Done, Remove)");
            System.out.println("(4) Save and Quit");
            System.out.print("Your Option: ");
            String command = scanner.nextLine();
            if (command.equals("4")){
                System.out.println("Do you want to save and quit?Y/N");
                String answer = scanner.nextLine();
                if (answer.equals("Y")) {
                    System.out.println("Have a Nice Day...");
                    break;
                }
            }

            if (command.equals("2")){
                System.out.print("To add: ");
                String toAdd = scanner.nextLine();
                this.todoList.add(toAdd);
            }else if (command.equals("1")){
                if (this.todoList.listSize() == 0){
                    System.out.println("********************************");
                    System.out.println("You don't have any task for ToDo");
                    System.out.println("********************************");
                    System.out.println();
                }
                this.todoList.print();
            }else if (command.equals("3")){
                System.out.print("Which one is removed? ");
                int toRemove = scanner.nextInt();
                System.out.println("Your " + toRemove + "- task is removing...");
                this.todoList.remove(toRemove);
                System.out.println("Your " + toRemove + "- task is removed...");
                System.out.println();
            }
        }
    }
}