package ifff;
import java.util.Scanner;

public class andOroperator {
    public static void main(String[]args){
        Scanner he=new Scanner(System.in);
        int n=he.nextInt();
        he.close();
        if(n>999&& n<10000)
            System.out.println("four digit");
        else System.out.println("not a four digit");
    }
    
}
