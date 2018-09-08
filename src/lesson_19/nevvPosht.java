package lesson_19;

public class nevvPosht {
    public static void main(String[] args) {
        int a1=5;
        int a2=8;

        Box b = new Box(15, 20, 60);
        Box c = new Box(15,20,61);
        if(b.equals(c)){
            System.out.println("true");
        }else System.out.println("false");

        System.out.println(b.hashCode());
        System.out.println(c.hashCode());



//        System.out.println(b.toString());
//        b = new PostBox(15, 20, 60, 250, 3);
//        System.out.println(b.toString());
//        b =new Parcel();
//        System.out.println(b.toString());
    }
}
