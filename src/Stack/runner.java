package Stack;

public class runner {
    public static void main(String[] args) {
        Stack mStack=new Stack(10);
        mStack.addElement(111);
        mStack.addElement(222);
        mStack.addElement(333);
        System.out.print("Стек: ");
        while (!mStack.isEmpty()) {
            int value = mStack.deleteElement();
            System.out.print(value);
            System.out.print(" ");
        }
        System.out.println("");
    }
}
