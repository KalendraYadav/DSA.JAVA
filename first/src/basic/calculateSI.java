package basic;

import java.util.Scanner;

public class calculateSI {
    static void main() {
        Scanner sc=new Scanner(System.in);
        double  p=sc.nextDouble();
        double r=sc.nextDouble();
        double t=sc.nextDouble();
        double si= p*r*t/100;
        System.out.println(si);

    }
}
