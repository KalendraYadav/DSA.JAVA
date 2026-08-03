package ARRAYotherDatatype5;
import java.util.Scanner;
public class takedouble {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        double [] lrr=new double [6];
        for(int i=0;i<lrr.length;i++){
            lrr[i]=sc.nextDouble();
        }

        for(int i=0;i<lrr.length;i++){
            System.out.print("  "+lrr[i]);
        }
    }
}
