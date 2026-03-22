import java.util.Scanner;

public class findingMagnitudelessThan69 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        if (n<0) n=-n;
        if(n<69){
            System.out.println("less than 69");
        }
        else{
            System.out.println("not less then 69");
        }
    }
    
}
