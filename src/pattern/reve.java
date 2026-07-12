package pattern;
import java.util.Scanner;

// 6 5 4 3 2 1 
// 6 5 4 3 2 
// 6 5 4 3 
// 6 5 4 
// 6 5 
// 6 
public class reve {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    
}
