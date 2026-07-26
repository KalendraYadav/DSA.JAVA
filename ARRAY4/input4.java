package ARRAY;
import java.util.Scanner;
public class input4 {
    public static void main(String[]args){
        Scanner h=new Scanner(System.in);


        int [] harsh= new int[5];

       //printing  the empty array.       
        for(int i=0;i<harsh.length;i++){
        System.out.print(harsh[i]+" ");
        }

        //taking input from user and storing it in array.
        for(int i=0;i<harsh.length;i++){
            harsh[i]=h.nextInt();
            
        }
        
        //printing the array after taking input.
        for(int i=0;i<harsh.length;i++){
            System.out.print((double)harsh[i]+" ");
            
        }
        System.out.println();
        for(int i=0;i<harsh.length;i++){
            System.out.print(2*harsh[i]+" ");
        }
        
        h.close();
}}
