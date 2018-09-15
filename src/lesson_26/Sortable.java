package lesson_26;

public interface Sortable <P extends Number> {
    void sort();
    void show();
    void addItem(P item);
}
