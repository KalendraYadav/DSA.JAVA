package ifff;
import java.util.Scanner;

public class profitLoss {
    public static void main(String[] args){
     Scanner pi=new Scanner(System.in);
     System.out.println("enter the cost price");
     int cp= pi.nextInt();
     System.out.println("enter the selling price");
     int sp= pi.nextInt();
     if(cp>sp){
        System.out.println("loss");
        System.out.println("the loss is :" + (cp-sp));
        System.out.printf("the loss percentage is %.4f%%" , ((cp-sp)/100.0));  //can use format specifier but fir printf use karna hoga not println.
     }
     else if(sp>cp){
        System.out.println("profit");
        System.out.println("the profit is:" +(sp-cp));
        System.out.printf("the profit percent is %f%%" ,(sp-cp)/100.0);
     }
     else{
        System.out.println("no profit no loss");
     }
     pi.close();
    }
    
}
