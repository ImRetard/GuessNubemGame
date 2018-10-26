package lesson_34_Iterators;

import java.util.*;

public class IteratorTest {
    public static void main(String[] args) {

        Collection<String> names=new LinkedList<>();

        names.add("Ihor");
        names.add("Alex");
        names.add("Endy");



//        for (int i = 0; i <names.size() ; i++) {
//            System.out.println(names.get(i));
//
//        }

        Iterator<String> iterator=names.iterator();

        while(iterator.hasNext()){
            String item=iterator.next();
            if(item.equals("Alex")){
                iterator.remove();
            }
        }

        for(String name:names){
            System.out.println(name);
        }


    }
}
