package lesson_18;

import java.util.Scanner;

public abstract class Figure {
    private String title;
    private FColor color;
    private int dim;

    public Figure() {
        this.title = "no title";
        this.color = FColor.BLACK;
        this.dim =-1;
    }

    public Figure(String title, FColor color, int dim) {
        this.title = title;
        this.color = color;
        this.dim = dim;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void setTitle(){
        Scanner ch = new Scanner(System.in);
        System.out.println("Please enter title: ");
        this.title=ch.next();
    }

    public FColor getColor() {
        return color;
    }

    public void setColor(FColor color) {
        this.color = color;
    }

    public int getDim() {
        return dim;
    }

    public void setDim(int dim) {
        this.dim = dim;
    }


    @Override
    public String toString() {
        return "Figure{" +
                "title='" + title + '\'' +
                ", color=" + color +
                ", dim=" + dim +
                '}';
    }
    public abstract void getArea();
}
