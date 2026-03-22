import java.util.Scanner;

public class absolute {
   public static void main(String[] args) {
       Scanner mm= new Scanner(System.in);
       System.out.println("enter the number");
    int n= mm.nextInt();
    if(n>=0){
        System.out.println("the absolute value of number is "+n);
    }
    else{
        System.out.println("the absolute value of number is "+ -n);
    }

   }
    
    
}
