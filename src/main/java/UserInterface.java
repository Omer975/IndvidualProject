import java.nio.file.Paths;
import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.*;
import java.text.ParseException;
import java.io.IOException;


public class UserInterface {
    private TodoList todoList;
    private Scanner scanner;

    public UserInterface(TodoList todoList, Scanner scanner){
        this.todoList = todoList;
        this.scanner = scanner;
    }

    public void start() throws IOException {
        while(true){
            System.out.println();
            System.out.println("Welcome to ToDoList");
            System.out.println("You have "+ this.todoList.taskSize() + " tasks todo and " + this.todoList.taskDoneSize()+ " tasks are done!");
            System.out.println("Pick an Option: ");
            System.out.println("__________________________________________");
            System.out.println(">>(1) Show task list (by date or project)");
            System.out.println(">>(2) Add New Task");
            System.out.println(">>(3) Edit Task (Update, Mark as Done)");
            System.out.println(">>(4) Remove Task");
            System.out.println(">>(5) Save and Quit");
            System.out.println("__________________________________________");
            System.out.print("Your Option: ");
            String command = scanner.nextLine();

            switch (command){
                case "1":
                    //todoList.printListinFile();


                    if (this.todoList.taskSize() == 0) {
                        System.out.println("********************************");
                        System.out.println("You don't have any task for ToDo");
                        System.out.println("********************************");
                        System.out.println();
                    }else{

                        System.out.println("Please Enter Your Choise: ");
                        System.out.println("1-List: ");
                        System.out.println("2-Sort by Date: ");
                        System.out.println("3-Sort by Project: ");
                        System.out.print("Your Option: ");
                        String commandList = scanner.nextLine();
                        if (commandList.equals("1")){
                            System.out.println("Your ToDoList(s): ");
                            this.todoList.print();
                        }else if (commandList.equals("2")){
                            this.todoList.printSortbyDate();
                        }else if (commandList.equals("3")){
                            this.todoList.printSortbyProject();
                        }else{
                            System.out.println("Wrong input");
                        }
                    }
                    break;

                case "2":
                    System.out.println("Enter Your ToDoList Informations:");
                    System.out.print("Task Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Project Name: ");
                    String project = scanner.nextLine();
                    System.out.print("Task Date(yyyy-MM-dd): ");
                    Scanner scan = new Scanner(System.in);
                    Date d = null;
                    try{
                        d = new SimpleDateFormat("yyyy-MM-dd").parse(scan.nextLine());
                    }catch (ParseException e){
                        e.printStackTrace();
                    }
                    System.out.print("Task Status: ");
                    String status = scanner.nextLine();
                    this.todoList.addRecord(title, project, d, status);

                    break;

                case "3":

                    System.out.println("Please Enter Your Choise: ");
                    System.out.println("1-Update Task Title: ");
                    System.out.println("2-Update Project: ");
                    System.out.println("3-Update Task Date: ");
                    System.out.println("4-Update Task Status: ");
                    System.out.print("Your Option: ");

                    String commandEdit = scanner.nextLine();

                    if (commandEdit.equals("1")){
                        System.out.print("Enter Task Title: ");
                        String taskTitle = scanner.nextLine();
                        System.out.print("Enter New Task Title: ");
                        String newTaskTitle = scanner.nextLine();
                        this.todoList.editTaskTitle(taskTitle, newTaskTitle);
                        System.out.println("Your task title is changed ");
                    }

                    else if (commandEdit.equals("2")){
                        System.out.print("Enter Project Name: ");
                        String projectName = scanner.nextLine();
                        System.out.print("Enter New Project Name: ");
                        String newProjectName = scanner.nextLine();
                        this.todoList.editProjectName(projectName, newProjectName);
                        System.out.println("Your project name is changed ");
                    }

                    else if (commandEdit.equals("3")){
                        System.out.print("Enter Project Name: ");
                        String projectName = scanner.nextLine();
                        System.out.print("Enter New Date for Project(yyyy-MM-dd): ");
                        Scanner sc = new Scanner(System.in);
                        Date dNew = null;
                        try{
                            dNew = new SimpleDateFormat("yyyy-MM-dd").parse(sc.nextLine());
                        }catch (ParseException e){
                            e.printStackTrace();
                        }
                        this.todoList.editProjectDate(projectName, dNew);
                        System.out.println("Your project date is changed ");
                    }

                    else if (commandEdit.equals("4")){
                        System.out.print("Enter Project Name: ");
                        String projectName = scanner.nextLine();
                        System.out.print("Enter Stratus: ");
                        String newStatus = scanner.nextLine();
                        this.todoList.editStatus(projectName, newStatus);
                        System.out.println("Your project status is changed ");
                    }
                    else {
                        System.out.println("Wrong Input");
                    }


                    break;

                case "4":
                    System.out.print("Enter Task ID for Remove: ");
                    int toRemove = scanner.nextInt();
                    System.out.println("Your " + toRemove + "  id task is removing...");
                    this.todoList.remove(toRemove);
                    System.out.println("Your " + toRemove + "  id task is removed...");
                    System.out.println();

                    break;

                case "5":
                    System.out.println("Do you want to save and quit?Y/N");
                    String answer = scanner.nextLine();
                    if (answer.equals("Y")) {
                        FileManagement.saveList(todoList.getListofTasks());
                        System.out.println("Have a Nice Day...");
                        break;
                    }
                    break;
                default:
                    System.out.println("Wrong Input");
            }
        }
    }
}
