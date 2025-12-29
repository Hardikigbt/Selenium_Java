package Test;

public class WhileLoopTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            if (i == 5) {
                System.out.println("Got 5");
                break;

            }
            i++;
        }

    }

}
