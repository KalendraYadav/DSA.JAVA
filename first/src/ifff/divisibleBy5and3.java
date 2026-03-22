import java.util.Scanner;

public class divisibleBy5and3 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        if(n%5==0){
            if(n%3==0){
                System.out.println("divisible by 5 and 3");
            }
            else{
                System.out.println("divisible by 5 only");
            }
        }
        else if(n%3==0){
            System.out.println("divisible by 3 only");
        }
        else{
            System.out.println("not divisible by 5 and 3");
        }
    }
}
