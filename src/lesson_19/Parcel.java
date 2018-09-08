package lesson_19;

import java.util.Random;

public class Parcel extends PostBox {
    private int id;
    private String clientName;
    private String adress;

    public Parcel() {
        this.id = 0;
        this.clientName = "Igor";
        this.adress = "adress";
    }

    public Parcel(int h, int vv, int d, int price, int m, int id, String clientName, String adress) {
        super(h, vv, d, price, m);
        this.id = id;
        this.clientName = clientName;
        this.adress = adress;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int calcDistence() {
        Random rnd = new Random();
        return rnd.nextInt(1800) + 100;
    }

    @Override
    public int calcTime() {
        int bdays = super.calcTime();
        int distance = calcDistence();
        if (distance < 100 && bdays > 2) {
            bdays -= 2;
        }
        if (distance >= 100 && distance < 1000) {
            bdays += 1;

        }
        if (distance >= 1000) {
            bdays += 3;
        }
        System.out.println("For Parcel Delivery " + bdays + " days");
        return bdays;

    }

//    @Override
//    public String toString() {
//        return "Parcel{" +
//                "id=" + id +
//                ", clientName='" + clientName + '\'' +
//                ", adress='" + adress + '\'' +
//                "} " + super.toString();
//    }
}
