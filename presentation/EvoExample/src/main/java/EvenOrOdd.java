import java.util.Random;

public class EvenOrOdd {
    public static String check(int num) {
        if (num % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }

    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(100) + 1;
        String result = check(num);
        System.out.println(num + " is " + result);
    }
}