package DSApractice;
import java.util.Arrays;

public class mergethearray1 {
    public static void main(String[] args) {
        int []nums1 = {1,2,3,0,0,0};
        int m = nums1.length;
         int []nums2 = {2,5,6};
         int n = nums2.length;

         for(int i=0;i<n;i++){
            nums1[i+m-3]=nums2[i];
         }

         Arrays.sort(nums1);
System.out.println("the sorted array is");
         for(int i=0;i<n+m;i++){
            System.out.print(nums1[i]+" ");
         }
    }
    
}
