import java.util.Scanner;

public class bridgePattern {
    public static void main(String[] args) {
     
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int nsp=0, nst=n;
    sc.close();
    for(int i=1;i<=2*n-1;i++){
        System.out.print("* ");
        
    }

        System.out.println();
                                         /* for n=5;
                                          @@@@@@@@@   is line ko alag se print kar dena, isko ek loop me rakho.
                                          @@@@ @@@@   yaha teen diff pattern hai isliye iske liye ek another loop ke andar teen loop.
                                          @@@   @@@
                                          @@     @@
                                          @       @               */
 


    nsp=1;
    nst=n-1;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=nst;j++){
         
            System.out.print("* ");
        }

        for(int j=1;j<=nsp;j++){
            System.out.print("  ");
       
        }
        for(int j=1;j<=nst;j++){
            System.out.print("* ");


        }
        nsp+=2;
        nst--;
        System.out.println();
    }
}
}

