package DSApractice;

public class pairSumLessthenTArget1 {
    public static void main(String[] args) {
        int []nums = {-1,1,2,3,1}; 
        int target = 2;

        int count=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j]<target)
                    count++;

            }
        }
        System.out.println("the number of such pairs are: "+count);
    }
    
}
