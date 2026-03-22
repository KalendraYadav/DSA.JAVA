
import java.util.Scanner;

// number of space & number of star METHOD(NSP ,NST METHOD).
public class pyramidULTIMATEmethod {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nsp=n-1, nst=1;
        
         for(int i=1;i<=n;i++){
        for(int j=1;j<=nsp;j++){
            // System.out.print("# ");
            System.out.print("  ");
        }

        for(int j=1;j<=nst;j++){
            System.out.print("* ");
       
        }
        nsp--;
        nst+=2;
        System.out.println();
        sc.close();
    }
}
    
}
