import java.util.Scanner;

public class revewrseOfnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rev=0;
        int sum=0;
        for(int i=0;n!=0;i++){
            int d=n%10;
            sum=sum+d;
            rev=rev*10+d;
            n=n/10;
        }
        System.out.println((rev<0)?-rev:rev);
        System.out.println("sum is: "+((sum>0)?sum:-sum));
    }
}
