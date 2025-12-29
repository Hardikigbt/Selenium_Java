package Test;

public class ReturnTypeTest {

    public static void main(String[] args) {

        System.out.println(sum());
        int x = sum();
        System.out.println(x);
        System.out.println(hello());

    }

    public static int sum() {
        int a = 4 + 5;
        return a;
    }

    public static String hello() {
        String s = "Hello Java";
        return s;

    }
}
