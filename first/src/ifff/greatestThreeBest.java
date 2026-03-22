import java.util.Scanner;

public class greatestThreeBest {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number");
        int a=sc.nextInt();
        System.out.println("enter second number");
        int b=sc.nextInt();
        System.out.println("enter third number");
        int c=sc.nextInt();

        int larg=a;
        if(b>larg) larg=b;
        if(c>larg) larg =c;
        System.out.println("the largest number is"+ larg);


    }
    
}
