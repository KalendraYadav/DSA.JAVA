package pattern;
import java.util.Scanner;
public class reverseTriangleDiffMethod {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        int a=n;
        for(int i=1;i<=n;i++){  //no of rows
            for(int j=1;j<=a;j++){ //no of columns
                System.out.print(j+" ");
            }
            a--;
            System.out.println();
        }
    }
    
}

    

