import java.util.Scanner;

public class UltraPattern { /* for n=3. ke liye
                                11111    if(i>n) replace i with (2n-i)
                                12221    if(j>n) replace j with (2n-j)
                                12321
                                12221
                                11111 */
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=1;i<=2*n-1;i++){
      for(int j=1;j<=2*n-1;j++){
        int a=i,b=j;
        if(i>n) a=2*n-i;
        if(j>n) b=2*n-j;
        System.out.print(Math.min(a, b)); //if else bhi use kar sakte hai
      }
      System.out.println();
    }
    sc.close();
  }                              
    
}
