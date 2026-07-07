package ifff;
import java.util.Scanner;

public class ternaryINnestedLoop {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first numbers");
        int a=sc.nextInt();
        System.out.println("Enter the second numbers");
        int b=sc.nextInt();
        System.out.println("Enter the third numbers");
        int c=sc.nextInt();
          System.out.println("The largest number is");
        System.out.println((a>b)?((a>c)?a:c): ((b>c)?b:c));
    }
    
}
