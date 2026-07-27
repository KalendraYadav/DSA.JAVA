package searchinarray7;
import java.util.Scanner;
public class findx1 {
    public static void main(String[] args){
        int [] arr={4,58,2,56,1,0,56,-9,-8,-45,1,2};

        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();

        //searching for x in the array arr
        boolean flag= false;
        int i;
        for(i=0;i<arr.length;i++){
            if(arr[i]==x){
                //  System.out.println("element found in the array at index "+i);
                 flag= true;
                //  break;
            }
        }
        if(flag==true)
        System.out.println("element found in the array at index "+i);
        else
        System.out.println("element not found in the array");
    }
    
}
