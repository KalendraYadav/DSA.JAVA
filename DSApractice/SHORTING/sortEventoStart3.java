package DSApractice.SHORTING;
public class sortEventoStart3{
    public static void main(String[]args){
        int [] nums={3,1,2,4,8,9,7};
        int [] ans=new int[nums.length];
        int n=7;
        int indx=0;
        int oddindx=n-1;
        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                ans[indx]=nums[i];
                indx++;
            }
            else{
                ans[oddindx]=nums[i];
                oddindx--;
            }

        }

        //print the new array
        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }
    }

}