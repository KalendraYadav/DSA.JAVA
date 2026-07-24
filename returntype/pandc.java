package returntype;

import java.util.Scanner;

public class pandc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();

        //NcR

        int nfact =1;
        for(int i=1; i<=n;i++){
            nfact=nfact*i;
        }
        int rfact=1;
        for(int i=1; i<=r;i++){
            rfact=rfact*i;

        }
        int nrfact=1;
        for(int i=1;i<=(n-r);i++){
            nrfact=nrfact*i;
        }



        int ncr=nfact/(rfact*nrfact);
        System.out.println(ncr);

    }
    
}
