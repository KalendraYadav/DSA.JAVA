package ARRAY;

public class shallowcopy1 {
    public static void main(String[] args){
        int [] arr={4,5,-65,140};
        int [] crr= arr;
        crr[0]=10;
        System.out.println(arr[0]); //iska value bhi 10 aayega 4 nahi.
    }
    
}
