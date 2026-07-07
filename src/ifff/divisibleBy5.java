import java.util.Scanner;

public class divisibleBy5{
    public static void main(String[] args){
        Scanner kal= new Scanner(System.in);
        System.out.println("enter the number");    //alt+ shift se copy the line
                                                     //alt +arro se move the line
        int n= kal.nextInt();  
        if(n%5==0){
            System.out.println("divisible by 5");
         
        }
        else{
        System.out.println("not divisible by 5");
        }
        
    }
}