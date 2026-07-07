package ifff;
import java.util.Scanner;

public class absolute2 {
    public static void main(String[] args){
        Scanner b=new Scanner(System.in);
        System.out.println("enter the number");
        int n=b.nextInt();

        if(n<0) n=-n;
        System.out.println("the absolute value is "+n);

    }
    
}
