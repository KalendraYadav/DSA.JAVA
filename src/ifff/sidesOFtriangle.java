package ifff;
import java.util.Scanner;

public class sidesOFtriangle {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the sides of triangle");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        
        if(a+b>c&& b+c>a&&c+a>b){             //arithmetic operators ka priority jada hota hai relational se ,isliye pahle a+b evaluate hoga than compare. waise bracket use kar sakte ho
            System.out.println("yes these are the sides of triangle");
        }
        else{
            System.out.println("invalid triangle");
        }
        sc.close();
    }
    
}
