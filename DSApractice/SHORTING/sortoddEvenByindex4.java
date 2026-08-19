package DSApractice.SHORTING;

public class sortoddEvenByindex4 {
    public static void main(String[]args){
        int nums[]={3,4,7,8,6,2,9};
        int n=nums.length;
        int ans[]=new int [n];
        int eindx=0;
        int oindx=1;
        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                ans[eindx]=nums[i];
                eindx+=2;
            }
            else{
                ans[oindx]=nums[i];
                oindx+=2;
            }

        }

        //print the output array that is soted
        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
