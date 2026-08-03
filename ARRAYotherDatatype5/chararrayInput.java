package ARRAYotherDatatype5;
import java.util.Scanner;
public class chararrayInput {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char[] kal= new char[6];
        for(int i=0;i<kal.length;i++){
            kal[i]=sc.next().charAt(0);


        }
        for(int i=0; i<kal.length;i++){
            System.out.println(kal[i]);
        }
        sc.close();
    }
    
}
