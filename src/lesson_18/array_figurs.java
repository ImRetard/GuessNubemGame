package lesson_18;

import java.util.ArrayList;

public class array_figurs {
    public static void main(String[] args) {
        ArrayList<Figure> array = new ArrayList<>();
//        Figure fifure1 = new Figure("figure", FColor.BLACK, 5);
        Circle circle1 = new Circle("circle1", FColor.BLUE, 10);
        Rectangle rectangle1 = new Rectangle("some rectangle", FColor.GREEN, 15, 30);

//        array.add(fifure1);
        array.add(circle1);
        array.add(rectangle1);
        array.add(new Circle("circle 2", FColor.RED, 180));

        for (int i = 0; i <array.size() ; i++) {
            array.get(i).getArea();
        }
    }
}
