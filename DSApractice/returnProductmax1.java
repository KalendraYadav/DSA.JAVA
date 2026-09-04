package DSApractice;
import java.util.Arrays;
public class returnProductmax1 {
    public static int product(int[] nums, int n){
        Arrays.sort(nums);
        int max=(nums[n-1]-1)*(nums[n-2]-1);
        return max;

    }
    public static void main(String[] args) {
        int [] nums={2,3,5,4};
        int n=nums.length;
        System.out.println(product(nums, n));
    }
    
}
