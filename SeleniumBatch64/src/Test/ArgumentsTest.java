package Test;

public class ArgumentsTest {

    public static void main(String[] args) {

        sum(5, 6); //5+6
        sum(8, 9); //8+9
        sum(1, 2, 3);
        sum();


    }

    public static void sum() {
        int a = 4 + 5;
        System.out.println(a);
    }

    public static void sum(int b, int c) {
        int a = b + c;
        System.out.println(a);
    }

    public static void sum(int b, int c, int d) {
        int a = b + c + d;
        System.out.println(a);
    }


}

