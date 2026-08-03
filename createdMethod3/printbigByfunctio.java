package createdMethod;

public class printbigByfunctio {
    public static void big(int a, int b, int c){
    if(a>b&& a>c){
        System.out.println(a+ " is the big number");
    }
    else if(b>c){
        System.out.println(b+ " is the big number");
    }
    else{
        System.out.println(c+" is the big number");
    }

    }
    public static void main(String[]args){
        big(5, 4, 6);
    }

    }
    

