package ifff;
import java.util.Scanner;

public class takingInput {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        
        int khushi;
        // if(n>0)
        //     khushi=100;
        // else
        //     khushi=0;

        //or we can write it in one line using ternary operator

        // khushi= (n>0)? 100:0;
        // System.out.println(khushi);

        //or can directly print it in one line using ternary operator
        
        System.out.println((n>0)?100:0);
        sc.close();
        
    }
    
}
