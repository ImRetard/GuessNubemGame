package lesson_18;

public class Circle extends Figure {
    public Circle() {
    }

    public Circle(String title, FColor color, int dim) {
        super(title, color, dim);
    }

    @Override
    public void getArea() {
        System.out.println("Circle area is"+Math.PI*(getDim()*getDim())/2);
    }
}
