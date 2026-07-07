package basic;
import java.util.Scanner;

public class takingInput {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the value of radius: ");
        double r=sc.nextDouble();
        double a=3.14159*r*r;
        System.out.println("area is "+ a);
    }
}
