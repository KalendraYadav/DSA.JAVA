package basic;

import java.util.Scanner;

public class sumOf2 {
    public static void main(String[] args) {
        Scanner hii= new Scanner(System.in);
        System.out.println("enter the first numver");
        int num1= hii.nextInt();
        System.out.println("enter the second number");
        int num2= hii.nextInt();
        System.out.println("enter the third number");
        int num3=hii.nextInt();
        System.out.println("the sum of all the numbers is");
        System.out.println(num1+num2+num3);
    }
}
