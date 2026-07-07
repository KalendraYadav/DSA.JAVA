package loops;
import java.util.Scanner;

public class GP {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of terms you want in the gp series");
        int n=sc.nextInt();
        int a=1,r=2;
        for(int i=1;i<=n;i++){
            System.out.println(a);
            a=a*r;
        }
    }
    
}
