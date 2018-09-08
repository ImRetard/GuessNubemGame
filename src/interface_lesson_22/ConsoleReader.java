package interface_lesson_22;

import java.util.Scanner;

public class ConsoleReader implements Read {
    @Override
    public String getDate() {

        Scanner ch = new Scanner(System.in);
        System.out.print("Please enter text: ");
        String line=ch.nextLine();
        return line;
    }
}
