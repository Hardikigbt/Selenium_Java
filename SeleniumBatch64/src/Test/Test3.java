package Test;

public class Test3 {

    static Test3 t3 = new Test3();
    static Test1 t1 = new Test1();

    public static void main(String[] args) {
        circle();
        t3.square();
        Test1.printMe();
        t1.testMe();

    }

    public static void circle() {
        System.out.println("circle");
    }

    public void square() {
        System.out.println("square");

    }
}
