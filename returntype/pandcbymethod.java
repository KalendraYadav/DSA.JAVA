package returntype;
import java.util.Scanner;
public class pandcbymethod {
    public static int fact(int x){
    
        int f=1;
        for(int i=1;i<=x;i++){
            f=f*i;
        }
        return f;
    }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the value of n");
    int n=sc.nextInt();
    System.out.println("enter the value of r");
    int r=sc.nextInt();

    // fact(n);
    // fact(r);
    // fact(n-r);
    System.out.println(fact(n)/((fact(r)*(fact(n-r)))));

    System.out.println("the value of npr is"+ fact(n)/(fact(n-r)));
}

}