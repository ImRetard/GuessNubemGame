package lesson_18;

public class Rectangle extends Figure {
    private int dim2;

    public Rectangle() {
        this.dim2 = -1;

    }

    public Rectangle(String title, FColor color, int dim, int dim2) {
        super(title, color, dim);
        this.dim2 = dim2;

    }

    public int getDim2() {
        return dim2;
    }

    public void setDim2(int dim2) {
        this.dim2 = dim2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "dim2=" + dim2 +
                "} " + super.toString();
    }

    @Override
    public void getArea() {
        System.out.println("Rectangle area is"+dim2*getDim());
    }
}
