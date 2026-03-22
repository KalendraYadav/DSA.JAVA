import java.util.Scanner;

public class cordinateBest {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter x axis");
        int x=sc.nextInt();
        System.out.println("enter y axis");
        int y=sc.nextInt();
        sc.close();
        if(x==0&&y==0){
            System.out.println("lies on origin");
        }
        else if(x==0)
            System.out.println("lies on y axis");
        else if(y==0)
            System.out.println("lies on x axis");
        else if(x>0){
            if(y>0)
                System.out.println("first ");
            else 
                System.out.println("fourth");
        }
        else {
            if(y>0)
                System.out.println("second");
            else
                System.out.println("third");
            
        }

    }
    
    
}


