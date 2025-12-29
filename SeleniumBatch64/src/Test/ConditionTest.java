package Test;

public class ConditionTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int a = 20;
        int b = 20;
        if (a == b) {
            System.out.println("a and b are equal");

        } else {
            System.out.println("a and b are not equal");
        }
        String expceted = "Selenium";
        String actual = "Selenium";

        if (expceted.equals(actual)) {
            System.out.println("test pass");

        } else {
            System.out.println("test fail");

        }
    }

}
