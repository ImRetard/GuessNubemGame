package lessons_26;

public class runner {
    public static void main(String[] args) {
        Sortable sort=new InversSorting(2);
        sort.randomFill();
        sort.show();
        sort.sort();
        sort.show();
    }
}
