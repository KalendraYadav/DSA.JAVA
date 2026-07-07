package loops;
import java.util.Scanner;

public class breakContinueDIFF {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");

        int n=sc.nextInt();
        int x=0;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                x=1;
                break;
            }}

             if(x==1) System.out.println("composite");
            else System.out.println("prime");
        
    }
    
}
