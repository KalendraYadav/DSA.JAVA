import java.util.Scanner;

public class continueBreak {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p=0;
        for(int i=2;i<=n/2;i++){
            if(n%i==0)
                p++;
        }
                  //1 ke liye galat jawab dega so if ,else if add karo
            if(n<0||n==1) System.out.println("neither prime nor composite");
            else if(p>0)
                System.out.println("composite");
            else System.out.println("prime ");
       
    }
    
}
