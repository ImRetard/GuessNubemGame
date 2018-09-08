package interface_lesson_22;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FReader implements Read {
    private String filepath;


    public FReader(String filepath) {
        this.filepath = filepath;
    }


    @Override
    public String getDate() {
        String line=null;
        try {
            FileReader fileReader = new FileReader(filepath);

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            line = bufferedReader.readLine();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return line;
    }
}
