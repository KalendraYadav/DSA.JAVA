package ARRAYotherDatatype;
import java.util.Scanner;
public class stringInput {
    public static void main(String[]args){
        Scanner ka=new Scanner(System.in);
        String[] k=new String[5];

        for(int i=0;i<k.length;i++){
            k[i]=ka.nextLine();
        }
        System.out.println("printing the array after taking input");
        for(int i=0;i<k.length;i++){
            System.out.println(k[i]);
        }
    }
    
}
