package lesson_19;

public class PostBox extends Box {
    private int price;
    private int m;

    public PostBox() {
        this.price = 50;
        this.m = 14;
    }

    public PostBox(int h, int vv, int d, int price, int m) {
        super(h, vv, d);
        this.price = price;
        this.m = m;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    @Override
    public  int calcTime() {
        int bdays = super.calcTime();
        if (m >= 2 && m < 10) {
            bdays += 2;

        }
        if (m >= 10 && m < 50) {
            bdays += 3;
        }
        if (m >= 50) {
            if (getVolume() < 10) {
                bdays += 4;
            } else {
                bdays += 6;
            }

        }
        System.out.println("For PostBox Delivery " + bdays + " day");
        return bdays;

    }

//    @Override
//    public String toString() {
//        return "PostBox{" +
//                "price=" + price +
//                ", m=" + m +
//                "} " + super.toString();
//    }
}
