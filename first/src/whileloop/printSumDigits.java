import java.util.Scanner;

public class printSumDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        if(n<0) n=-n;
        for(int i=1;n!=0;i++){
            int d=n%10;
            sum=sum+d;
            n=n/10;
        }
        System.out.println(sum);
        // System.out.println((sum>0)?sum:-sum);  agar if(n>0) wali line include na karna chaho to ye line se print karo ternary operator
    }
    
}
