package Ticket;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class runner {
    public static void main(String[] args) {
//        Ticket t1 = new Ticket();
//        ticketInfo(t1);
        LocalDate someDate = LocalDate.of(2018,5,25);
        LocalDate someDate2 = LocalDate.parse("2018-05-19");

        System.out.println(someDate);
        System.out.println(someDate2);






    }



    public static void ticketInfo(Ticket l) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter type: ");
        l.Type=input.next();
        System.out.println("Enter time begin: ");
        l.Timebegin=input.next();
        System.out.println("Enter time end: ");
        l.Timeend=input.next();
        System.out.println("Enter comfort: ");
        l.Comfort=input.next();


    }

    public static void showTicketInfo(Ticket l) {
        System.out.println("Ticket info: ");
        System.out.println(l.Type);
        System.out.println(l.Timebegin);
        System.out.println(l.Timeend);
        System.out.println(l.Comfort);

    }

}
