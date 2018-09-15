package lesson_31;

public class BasicGeneric <T>{
    private T date;

    public BasicGeneric(T date) {
        this.date = date;
    }

    public T getDate() {
        return date;
    }

    public void setDate(T date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "BasicGeneric{" +
                "date=" + date +
                " T="+date.getClass().getName()+
                '}';
    }

    public static void main(String[] args) {
        BasicGeneric<String> line=new BasicGeneric<>("some text");
        System.out.println(line.toString());
        BasicGeneric<Integer> intline=new BasicGeneric<>(12345);
        System.out.println(intline.toString());

        //line=intline;
    }
}
