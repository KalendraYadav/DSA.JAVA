package ifff;
import java.util.Scanner;

public class integerCheck1Best {
    public static void main(String[] args){
        Scanner giro=new Scanner(System.in);
        System.out.println("enter the number");
        double num= giro.nextDouble();

        if(num== (int)num) { 
            System.out.println("integer");

        }
        else{
            System.out.println("not integer");
        }
        giro.close();
    }
    
}
