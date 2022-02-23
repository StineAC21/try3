import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Enter your name");
        Scanner scn = new Scanner(System.in);
        String name = scn.next();
        System.out.println("Hello " + name);
    }
}
