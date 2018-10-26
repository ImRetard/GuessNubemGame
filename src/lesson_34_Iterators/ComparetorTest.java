package lesson_34_Iterators;

import lesson_19.Box;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class ComparetorTest {
    public static void main(String[] args) {
        Collection<Box> names = new LinkedList<>();
        Box myBox = new Box(3, 3, 3);
        names.add(new Box(1, 1, 1));
        names.add(new Box(2, 2, 2));
        names.add(new Box(5, 5, 5));
        Iterator<Box> iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().compareTo(myBox));
        }
    }

}
