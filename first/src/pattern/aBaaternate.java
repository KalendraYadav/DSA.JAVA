import java.util.Scanner;

public class aBaaternate {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();                          //aaaa
                                                     //BBBB
        for(int i=1;i<=n;i++){
            char ch;
            if(i%2==1){
                ch=(char)(i+96);
            }
            else{
                ch=(char)(i+64);
            }
            for(int j=1;j<=n;j++){
                System.out.print(ch+" ");
            }
          System.out.println();
        }
    }
    
}
