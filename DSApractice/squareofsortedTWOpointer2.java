package DSApractice;

public class squareofsortedTWOpointer2 {
    public static void main(String[] args) {
        
        int arr[]={-5,-4,-3,-2,-1,0,2,3,4,5,6};
        int n=arr.length;
        int left=0;
        int right=n-1;
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            if(Math.abs(arr[left])>arr[right]){
             ans[n-1-i]=arr[left];
             left++;

            }
            else{
                ans[n-1-i]=arr[right];
                right--;
            }

        }

        //squaring the element in the arrays
        for(int ele:ans){
            System.out.print(ele*ele+" ");

        }

        }
    
}
