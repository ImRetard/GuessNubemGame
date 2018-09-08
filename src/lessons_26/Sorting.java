package lessons_26;

import java.util.Random;

public abstract class Sorting implements Sortable {
    private int array[];

    public Sorting() {
        this.array = new int[10];
    }

    public Sorting(int size) {
        this.array = new int[size];
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }


    @Override
    public void show() {
        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    @Override
    public void randomFill() {
        Random rnd=new Random();
        for (int i = 0; i <array.length ; i++) {
            array[i]=rnd.nextInt(20);

        }
    }
}
