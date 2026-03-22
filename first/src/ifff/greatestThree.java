import java.util.Scanner;

public class greatestThree {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number");
        int a=sc.nextInt();
        System.out.println("enter second number");
        int b=sc.nextInt();
        System.out.println("enter third number");
        int c=sc.nextInt();


        // if(a>b&&a>c) System.out.println("the largest number is"+a);
        // if(b>a&&b>c) System.out.println("the largest number is "+b);
        // if(c>a&&c>b) System.out.println("the largest number is " +c);

         if(a>b&&a>c) System.out.println("the largest number is"+a);
       else if(b>c) System.out.println("the largest number is "+b);
       else System.out.println("the largest number is " +c);


    }
    
}
