package DSApractice;

public class concetnation2 {
    public static void main(String[]args){
        int [] nums={4,1,5,2,8,69};
        int []ans=new int[2*(nums.length)];

        for(int i=0;i<nums.length;i++){ //we do not need to run loop for 2n times
          ans[i]=nums[i];
          ans[i+nums.length]=nums[i];
        }
        for(int i=0;i<ans.length;i++)
{
    System.out.print(" " +ans[i]);
}    }
}
