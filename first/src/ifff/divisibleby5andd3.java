import java.util.Scanner;

public class divisibleby5andd3 {
    public static void main(String[]args){
        Scanner g=new Scanner(System.in);
        System.out.println("enter the number");
        int n=g.nextInt();

        if(n%5==0&& n%3==0){
            System.out.println("div by both");
        }
        else if(n%5==0)
            System.out.println("div by 5");
        else if(n%3==0)
            System.out.println("div by 3");
        else
            System.out.println("not div by anyone");

    }
    
}
