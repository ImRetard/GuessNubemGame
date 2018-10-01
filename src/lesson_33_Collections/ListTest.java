package lesson_33_Collections;

import lesson_19.Box;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<Box> boxes=new LinkedList<>();
        HashSet<Box> boxesSet=new HashSet<>();

        Box box1= new Box(1,1,1);
        Box box2= new Box(2,2,2);

        System.out.println(boxes.add(box1));
        System.out.println(boxes.add(box2));
        System.out.println(boxes.add(box1));
        System.out.println(boxes);

        System.out.println(boxesSet.add(box1));
        System.out.println(boxesSet.add(box2));
        System.out.println(boxesSet.add(box1));
        System.out.println(boxesSet);




    }
}
