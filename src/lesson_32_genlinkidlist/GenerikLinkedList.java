package lesson_32_genlinkidlist;

public class GenerikLinkedList {
    public static void main(String[] args) {
        LinkedList<Box> boxes=new LinkedList<>();
        boxes.append(new Box(10,10,10));
        boxes.append(new Box(20,20,20));
        boxes.append(new Box(40,40,40));
        boxes.shovvList();
        //System.out.println(boxes.findItem());
        boxes.deleteItem(boxes.findItem().data);
        boxes.shovvList();
    }
}
