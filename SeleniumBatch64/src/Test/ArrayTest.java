package Test;

public class ArrayTest {

    public static void main(String[] args) {


        String tools1[] = {"Selenium", "Java", "Junit", "TestNG", "TestRail"};
        System.out.println(tools1.length);

        System.out.println(tools1[0]);
        System.out.println(tools1[1]);
        System.out.println(tools1[2]);
        System.out.println(tools1[3]);
        System.out.println(tools1[4]);

        for (int i = 0; i < tools1.length; i++) {

            System.out.println(tools1[i]);
        }

        int numbers[] = {1, 5, 11, 200, 560};
        System.out.println(numbers.length);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("------------------------------");
        Object mix[] = {"abc", 6, 'd'};
        System.out.println(mix.length);

        for (int i = 0; i < mix.length; i++) {
            System.out.println(mix[i]);
        }


    }

}
