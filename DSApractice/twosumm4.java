package DSApractice;

public class twosumm4 {
    public static void main(String[] args) {
        int arr[]={1,3,6,8,17,45,51};
        int target =51;
        int n=7;
        int left=0;
        int right=n-1;
        int ans[]=new int[2];
        while(left<=right){
            if(arr[left]+arr[right]==target){
                ans[0]=left;
                ans[1]=right;
                break;

            }

            else if(arr[left]+arr[right]<target){
                left++;
            }
            else{
                right--;
            }
        }

        for(int ele:ans){
            System.out.print(ele+" ");

        }
    }
}
