package lesson_26;

import java.util.Random;

public abstract class Sorting <P extends Number> implements Sortable<P> {
    private P array[];

    public Sorting() {
        this.array = (P[]) new Object[3];
    }

    public Sorting(int size) {
        this.array = (P[]) new Object[size];
    }


    @Override
    public void show() {
        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    public P[] getArray() {
        return array;
    }

    /*@Override
        public void randomFill() {
            Random rnd=new Random();
            for (int i = 0; i <array.length ; i++) {
                array[i]= (P) rnd.nextInt(20);

            }
        }*/
    public void addItem(P data){
        for (int i = 0; i <array.length ; i++) {
            if(array[i]==null){
                array[i]=data;

            }

        }
    }
}
