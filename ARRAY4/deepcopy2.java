package ARRAY;
import java.util.Arrays;
public class deepcopy2 {
    public static void main(String[] args){
        int [] k={5,5,6,-9,6,0};
        
        int [] l= Arrays.copyOf(k,k.length); //deep copy
        l[0]=99;
        System.out.println(k[0]); //iska value 5 aayega 99 nahi.
        System.out.println(l[0]); //iska value 99 aayega 5 nahi.
    }
    
}
