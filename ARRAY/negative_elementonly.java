package ARRAY;
import java.util.Scanner;
public class negative_elementonly {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        
     int [] arr=new int[5];  //array declare

     for(int i=0;i<arr.length;i++){    //took input of the array element
       arr[i]=sc.nextInt();
     }
     for(int i=0;i<arr.length;i++){  //print the element
        if(arr[i]<0){

            System.out.printf("the negative element for %d is %d :" ,i , arr[i]);
        }
        else{
            continue;
        }

     }
    }
    
}
