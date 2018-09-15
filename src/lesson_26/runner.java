package lesson_26;

public class runner {
    public static void main(String[] args) {
        Sortable sort = new BubleSorting<Double>();
        sort.addItem(123.0);
        sort.addItem(234.5);
        sort.addItem(23.5);


        sort.show();
        sort.sort();
        sort.show();
    }
}
