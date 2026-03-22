import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner h=new Scanner(System.in);
        int n=h.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        System.out.println(fact);
    }
    
}
