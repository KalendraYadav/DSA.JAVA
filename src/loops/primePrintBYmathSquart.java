package loops;
import java.util.Scanner;

public class primePrintBYmathSquart {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        for(int i=2; i<=Math.sqrt(n);i++){
            if(n%i==0){
                System.out.println("composite");
                return;
                // break; note break will not work here because it will only exit the loop, but we want to exit the method entirely if we find a factor.
            }
        }
        System.out.println("prime");
    }
    
}
