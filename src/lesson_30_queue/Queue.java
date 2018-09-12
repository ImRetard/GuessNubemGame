package lesson_30_queue;

import lesson_27.LinkedListt;

public class Queue implements IQueue {
    private LinkedListt items;

    @Override
    public void insert(int data) {
        items.append(data);

    }

    @Override
    public boolean remove() {
        return (items.deleteItem()!=null);



    }

    @Override
    public int peek() {
        return 0;
    }
    public boolean isEmpty(){
        return false;
    }
}
