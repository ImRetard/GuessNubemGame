package lesson_29_Stack;

public class Stack {
    private int mSize; //mSize - максимальный размер
    private int[] stackArray;
    private int top;

    public Stack(int m) {
        this.mSize = m;
        stackArray = new int[mSize];
        top = -1;
    }
    public void addElement(int element) {
        if(isFull()){
            System.out.println("Stack overflow");
        }else stackArray[++top] = element;

        //isFull() ? System.out.println("Stack overflow") :  (stackArray[++top] = element);
    }
    public int deleteElement() {
        if(isEmpty()){
            System.out.println("Stack is empty");
            return 0;
        }else return stackArray[top--];
    }

    @Override
    public String toString() {
        return "Stack{" +
                "mSize=" + mSize +
                ", stackArray=" + stackArray +
                ", top=" + top +
                '}';
    }

    public int readTop() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }
    public boolean isFull (){
        return (top==mSize-1);
    }
}
