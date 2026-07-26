package ARRAY;
import java.util.Scanner;
public class sumofelementArray {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int[] prr=new int[n];
        System.out.println("enter the element of the array");


        for(int i=0;i<prr.length;i++){
            prr[i]=sc.nextInt();
        }

        //printing the sum of the element of the arrays

        int sum=0;
        for(int i=0;i<prr.length;i++){
            sum=sum+prr[i];
        }
        System.out.println("the sum of the element of the array is "+ sum);


        int pro=1;
        for(int i=0;i<prr.length;i++){
            pro*=prr[i];
        }
        System.out.println(pro);
    }
    
}
