import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("enter the two number");
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b= sc.nextInt();
        int perimeter= 2 * (a+b);
        System.out.println("the perimeter of rectangle is "+perimeter);

    }
}