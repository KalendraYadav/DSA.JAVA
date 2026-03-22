import java.util.Scanner;

public class coordinate {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the x asis");
        int x=sc.nextInt();
        System.out.println("enter the y asis");
        int y=sc.nextInt();
        if(x>0&&y>0)
            System.out.println("first ");
        else if(x>0&&y<0)
            System.out.println("fourth");
        else if(x<0&&y>0)
            System.out.println("second");
        else if(x<0&&y<0)
            System.out.println("third");
        else if(x==0&& y!=0)
            System.out.println("point on y axis");
        else if(y==0&& x!=0)
            System.out.println("point on x axis");
        else
            System.out.println("point on the origin");
    }
    
}
