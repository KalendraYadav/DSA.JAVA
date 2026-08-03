package returntype;

public class maxbyfunction {
    public static double max(double a, double b, double c){
        System.out.println("hello");
        if(a>b&& a>c) return a;
        else if(b>c) return b;
        else return c;
       
    }


    public static void main(String[]args){
       System.out.println(max(12,47,85)) ;
    }
    
}
