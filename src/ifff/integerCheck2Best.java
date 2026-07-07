package ifff;
import java.util.Scanner;

public class integerCheck2Best {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        double n= sc.nextDouble();
        if(n%1==0){
            System.out.println("integer");
        }
        else{
            System.out.println("not integer");
        }
    }
    
} 
