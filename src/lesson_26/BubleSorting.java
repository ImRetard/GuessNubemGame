package lesson_26;

public class BubleSorting <P extends Number> extends Sorting<P> {
    public BubleSorting() {
        super();
    }

    public BubleSorting(int size) {
        super(size);
    }

    @Override
    public void sort() {
        P array[]=  getArray();
        int n = array.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (array[j].doubleValue() > array[j+1].doubleValue())
                {
                    // swap temp and arr[i]
                    P temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
    }
}
