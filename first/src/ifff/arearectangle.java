import java.util.Scanner;

public class arearectangle {
    public static void main(String[]arg){
        Scanner h=new Scanner(System.in);
        System.out.println("enter length");
        int l=h.nextInt();
        System.out.println("enter breath");
        int b=h.nextInt();
        int area= l*b;
        int per=2*(l+b);
        if(area>per){
            System.out.println("area is greater then the perimeter");
        }
        else{
            System.out.println("perimeter is greater than area");
        }
    }
    
}
