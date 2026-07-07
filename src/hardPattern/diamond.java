import java.util.Scanner;

public class diamond {
    public static void main(String[] args) {
     
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    sc.close();
    int nsp=n-1, nst=1;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=nsp;j++){
         
            System.out.print("  ");
        }

        for(int j=1;j<=nst;j++){
            System.out.print("@ ");
       
        }
        nsp--;
        nst+=2;
        System.out.println();
    }                                  /* 
                                             @   for n=4.
                                            @@@
                                           @@@@@
                                          @@@@@@@    yaha tk har line me nst=(2n-1) hai
                                        ____________  .
                                           @@@@@     is line me nst= (2n-3), and 2 se ghat raha hai.
                                            @@@
                                             @                */
 


    nsp=1;
    nst=2*n-3;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=nsp;j++){
         
            System.out.print("  ");
        }

        for(int j=1;j<=nst;j++){
            System.out.print("@ ");
       
        }
        nsp++;
        nst-=2;
        System.out.println();
    }
}
}


    


    