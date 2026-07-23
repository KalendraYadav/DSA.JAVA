package returntype;

public class multiplereturn {
    public static int kal(int a){
        System.out.println("kalendra");
        if(a>0) return 10;
        else return 12;
    }

    public static void main(String[]args){
        System.out.println(kal(5));
        System.out.println(kal(-4));
    }
    
}
