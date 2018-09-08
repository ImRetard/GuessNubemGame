package Ticket;

import java.time.LocalDateTime;

public class Ticket {
    private int id;
    private String price;
    private int row;
    private int seat;
    private String filmName;
    private LocalDateTime datetime;


    public void setDatetime(LocalDateTime datetime) {
        this.datetime = datetime;
    }

    public void setDatetime(String date) {
        this.datetime = LocalDateTime.parse(date);
    }


    String Type;
    String Timebegin;
    String Comfort;
    String Timeend;


}
