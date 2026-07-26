package sortingbybuiltin6;
import java.util.Arrays;
public class sorting {
    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print("  " + arr[i]);
        }
    }

    public static void main(String[] args){
        int [] brr={5,4,48,-9,3,2,1};
        print(brr);

        System.out.println("\nAfter sorting");
        Arrays.sort(brr);
        print(brr);
    }
    
}
