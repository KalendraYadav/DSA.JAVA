package returntype;
import java.util.Scanner;
public class swapbyfunction {


    public static void swap(int a, int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("the value of the a is"+a);
        System.out.println("the value of the b is"+b);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a");
        int a=sc.nextInt();
        System.out.println("enter the value of the b");
        int b=sc.nextInt();
swap(a,b);

    }
    
}
