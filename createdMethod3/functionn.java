package createdMethod;
public class functionn {

    public static void main(String[]args){
        karan();

    }


    public static void khushi(){
        System.out.println("hello khushi");
        mohan();
    }

    public static void karan(){
        System.out.println("hello karan");
        khushi();
    }

    public static void mohan(){
        System.out.println("hello mohan");


    }
}