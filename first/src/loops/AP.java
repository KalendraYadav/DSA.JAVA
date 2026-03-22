import java.util.Scanner;

public class AP {
    public static void main(String[] args) {
     Scanner h=new Scanner(System.in);
     int n= h.nextInt();
    //  for(int i=2;i<=(2+(n-1)*3);i=i+3){
    //     System.out.println(i);
    //  }


    int a=2;
    int d=3;
    for(int i=1;i<=n;i++){
        System.out.println(a);
        a=a+d;
    }
    }
    
}

