import java.util.Scanner;

public class abcdSquarwe {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); 
        if(n<=26){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }
    }
    else{
        System.out.println("wrong format");
    }
    }
    
}
