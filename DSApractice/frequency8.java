package DSApractice;
import java.util.Arrays;
public class frequency8 {
    public static void main(String[] args) {
        int[] arr={1,1,2,3,2,3,2,4,5};
        for(int i=0;i<arr.length;i++){
            int m=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    m++;
                }
            }
            arr[i]=m;
        }

        arr.sort();
    }
    
}
