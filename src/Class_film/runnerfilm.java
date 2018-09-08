package Class_film;

import java.util.Scanner;

public class runnerfilm {
    public static void filmInfo(Film q) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter genre: ");
        q.Genre=input.next();
        System.out.println("Enter rating: ");
        q.Rating=input.next();
        System.out.println("Enter studio: ");
        q.Studio=input.next();
        System.out.println("Enter producer: ");
        q.Producer=input.next();
        System.out.println("Enter actors: ");
        q.Actors=input.next();



    }

    public static void showFilmInfo(Film q) {
        System.out.println("Film info: ");
        System.out.println(q.Genre);
        System.out.println(q.Rating);
        System.out.println(q.Studio);
        System.out.println(q.Producer);
        System.out.println(q.Actors);



    }

}
