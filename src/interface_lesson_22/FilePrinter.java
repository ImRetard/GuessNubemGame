package interface_lesson_22;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FilePrinter implements Print {
    private String filepath;

    public FilePrinter(String filepath) {
        this.filepath = filepath;
    }

    @Override
    public void shovvDate(String g) {
        try (FileWriter fileWriter = new FileWriter(filepath)) {

            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write(g);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
