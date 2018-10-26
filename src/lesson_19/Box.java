package lesson_19;

import java.util.Comparator;
import java.util.Objects;

public class Box implements Comparable<Box> {
    private int h;
    private int vv;
    private int d;

    public Box() {
        this.h = 1;
        this.vv = 1;
        this.d = 1;
    }

    public Box(int h, int vv, int d) {
        this.h = h;
        this.vv = vv;
        this.d = d;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public void setH() {
        this.h = 18;
    }

    public int getVv() {
        return vv;
    }

    public void setVv(int vv) {
        this.vv = vv;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }
public double getVolume(){
        return ((h * vv * d) / 1000);
}
    public int calcTime() {
        double volume = getVolume();
        int days = 0;
        if (volume <= 1) {
            days = 1;
        }
        if (volume > 1 && volume < 10) {
            days = 3;
        }
        if (volume > 10) {
            days = 7;
        }

        System.out.println("Fox Box Delivery "+days+" day");
        return days;
    }

    @Override
    public String toString() {
        return "Box{" +
                "h=" + h +
                ", vv=" + vv +
                ", d=" + d +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Box box = (Box) o;
        return h == box.h &&
                vv == box.vv &&
                d == box.d;
    }

    @Override
    public int hashCode() {

        return Objects.hash(h, vv, d);
    }

    public int compare(Box o1, Box o2) {
        return 0;
    }

    @Override
    public int compareTo(Box someBox) {
        return Double.compare(this.getVolume(),someBox.getVolume());
    }
}
