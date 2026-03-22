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
        // khushi= (n>0)? 100:0;
        // System.out.println(khushi);
        System.out.println((n>0)?100:0);
        
    }
    
}
