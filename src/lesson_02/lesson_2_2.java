package lesson_02;

public class lesson_2_2 {
    public static void main(String[] args) {
        long start, end, result;
        // for while do-while

        // i = i+1; => i+=1 => i++ i--
        // i = i/20; i/=20

        start = System.currentTimeMillis();
        for (int i = 1; i <= 5; i++) {
            System.out.println("i - "+i);
        }
        end = System.currentTimeMillis();
        result = end-start;
        System.out.println("Time :"+(double)result/1000);



    }
}
