package createdMethod;
public class nextfunction{
    public static void main(String[]args){
        ram();

    }
    public static void ram(){
        System.out.println("ram");
        ramesh();

    }
    public static void ramesh(){
        System.out.println("ramesh");
        ram();
    }
}