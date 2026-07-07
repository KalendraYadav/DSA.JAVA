package ifff;
import java.util.Scanner;

public class greatestThreeNoAND {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number");
        int a=sc.nextInt();
        System.out.println("enter the second number");
        int b=sc.nextInt();
        System.out.println("enter the third number");
        int c=sc.nextInt();

        if(a>b){
            if(a>c) System.out.println("greatest is: "+a);
            else System.out.println("greatest is : "+c);
        }

        else {
            if(b>c) System.out.println("greatest is : "+b);
            else System.out.println("the greatest is:" +c);
        }
    }
    
}
