import java.util.Scanner;

public class printFactor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                System.out.print(i);       // note har number ka factor agar ek i hai to dusra n/i hota hai.
                System.out.print(" ");
                if(i!=n/i){            //64 ke case me 8 do baar print nahi hoga
                System.out.print(n/i);
                System.out.print(" ");
                }

            }
        }
    }
    
}
