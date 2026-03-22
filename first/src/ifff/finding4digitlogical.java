import java.util.Scanner;

public class finding4digitlogical {
    public static void main(String[]args){

        Scanner g=new Scanner(System.in);
        System.out.println("enter the numberr");
        int n=g.nextInt();
        if(n/1000!=0 && n/10000==0){
            System.out.println("four digit number");
        }
        else System.out.println("not a four digit number");
    }
    
}
