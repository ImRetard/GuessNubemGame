package lesson_30_queue;

public interface IQueue {
    void insert(int data);
    boolean remove();
    int peek();
}
