import java.util.Scanner;
/*1
  AB 
  123
  ABCD
  12345*/
public class pattern4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i%2==1){
                for(int j=1;j<=i;j++){
                    System.out.print(j);
                }}
                else{
                    for(int j=1;j<=i;j++){
                        System.out.print((char)(j+64));

                    }
                
            }
            System.out.println();
        }

    }
    
}
