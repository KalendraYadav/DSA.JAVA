import java.util.Scanner;

public class starprint {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int a=sc.nextInt();
        // int b=sc.nextInt();
        for(int i=1;i<=a;i++){             //bahar wala loop row
            for(int j=1;j<=a;j++){       //andar wala loop har row me no. of stars (columns)
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}

    

