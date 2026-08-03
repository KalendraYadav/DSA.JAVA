package DSApractice;

public class hello {
  
    public static void main(String[]args){
        int [] nums={0,1,2,5,3,4};
        int [] ans=new int[6];
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[nums[i]];
        }
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }
    }
}
    

