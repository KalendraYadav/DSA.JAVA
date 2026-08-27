package DSApractice;

public class rotatefind7 {
    public static void main(String[] args) {
        // int arr[]={4,5,6,7,1,2,3};
        // int arr[]={1,2,3,4,5};
        int arr[]={1,1,1,1};
        int n=arr.length;
        int breakpoint=0;
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                breakpoint++;
            }
        }

        if((breakpoint==0)||(breakpoint==1&&arr[n-1]<=arr[0]))
            System.out.print("sorted tha ");
        else
            System.out.print("was not sorted");

    }
    
}
