package ifff;
import java.util.Scanner;

public class integerCheck {
    public static void main(String[] args){
        Scanner h=new Scanner(System.in);
        System.out.println("enter any real number");
        double n= h.nextDouble();
       int k= (int) (n*10);  // java me multiply se pahle typecasting hota hai isliye n*10 ko bracket me rakho takki pahle gunna ho
       int p=k%10;

       if(p==0){
        System.out.println("integer");  //note ye code sahi nahi hai, agar number 4.0245 jaisa ho to ise yah integer bolega

       }
       else{
        System.out.println("not integer");
       }
       h.close();
    }
    
}
