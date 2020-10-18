import java.io.*;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class FileManagement {

    private static final String FILEPATH = "output.txt";

    public static void saveList(ArrayList<Task> tasks) throws IOException {
        FileWriter writer = new  FileWriter(FILEPATH);
        for (Task task : tasks) {
            try {
                writer.write(task.getTaskTitle() + ";" + task.getProjectName() + ";" + new SimpleDateFormat("yyyy-MM-dd").format(task.getTaskDate()) + ";" + task.getStatus() +"\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        writer.close();

    }

    public static ArrayList<Task> readFile(String FILEPATH) throws IOException {
        ArrayList<Task> tasks = new ArrayList<>();

        try (Scanner inp = new Scanner(Paths.get(FILEPATH))) {
            while (inp.hasNextLine()){
                String row = inp.nextLine();
                String[] parts = row.split(";");
                tasks.add(new Task(parts[0].trim(),parts[1].trim(), DateFormat.stringToDate(parts[2].trim()), parts[3].trim()));

            }

        }catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return tasks;

    }
}
