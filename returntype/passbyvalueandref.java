package returntype;

public class passbyvalueandref {
    public static void change(int x){
        x=20;
    }
    public static void main(String[]args){
        int a=10;
        System.out.println(a);
        change(a);   //pass by value
        System.out.println(a);
    }
    
}
