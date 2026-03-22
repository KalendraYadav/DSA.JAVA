

import java.util.Scanner;

public class countDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p=0;
        // for(int i=1;n!=0;i++){
        //     n=n/10;
        //     p++;
        // }
         if(n==0) n=8;  //0 bhii ek digit ka number hai isliye is line ko add kiya
        int i=1;
        while(n!=0){
            n=n/10;
            p++;
        }
        System.out.println("numberr of digits is :"+ p);
    }
    
}

