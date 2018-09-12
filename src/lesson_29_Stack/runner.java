package lesson_29_Stack;

public class runner {
    public static void main(String[] args) {
        Stack mStack=new Stack(4);
        mStack.addElement(111);
        mStack.addElement(222);
        mStack.addElement(333);
        mStack.addElement(444);
        mStack.addElement(555);
        System.out.print("Стек: ");
        while (!mStack.isEmpty()) {
            int value = mStack.deleteElement();
            System.out.print(value);
            System.out.print(" ");
        }
        System.out.println("");
    }
}
