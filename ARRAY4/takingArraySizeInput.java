package ARRAY;
import java.util.Scanner;
public class takingArraySizeInput {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size");
        int n=sc.nextInt();
        int [] krr=new int[n];

          System.out.println("enter array element");
        for(int i=0;i<krr.length;i++){
            krr[i]=sc.nextInt();

        }
         boolean flag =false;
        for(int i=0;i<krr.length;i++){
            if(krr[i]<0){
                System.out.println("the negative element ara" +krr[i]);
                flag =true;
            }
        }
        if(flag==false){
            System.out.println("no any negative elemtnt in the array");
        }

    }
    
}
