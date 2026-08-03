package DSApractice;
import java.util.Arrays;
public class secondmaxSorting4 {
    public static void main(String[] args) {
        int [] arr={7,-8,4,-2,3,6,-9,45,23,23,22,45,7};
        // int [] arr={5,5,5,5,5,5,5,5};

        System.out.println(sec(arr));
    }

    public static int sec(int arr[]){   //method will fail when the maximum element will appear more then once.
        Arrays.sort(arr);
        int max=arr[arr.length-2];
        for(int i=arr.length-2; i>=0;i--){
            if(arr[i]!=max) return arr[i];
        }
        return -1; //all elements are same.
    }
    
}
