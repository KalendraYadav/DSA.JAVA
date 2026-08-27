package DSApractice;//it will not handle when all elements are same in the array

public class roatatefind6 {
    public static void main(String[] args) {
        int arr[]={4,5,6,7,1,2,3};
        // int arr[]={1,2,3,4,5};
        int n=arr.length;
        int breakpoint=0;

        for(int i=0;i<n-1;i++){
            if(arr[i+1]>arr[i]){
                continue;
            }
            else{
                breakpoint++;
            }
        }

        if((breakpoint==0)||(breakpoint==1&&arr[n-1]<arr[0]))
            System.out.print("sorted tha");
        else
            System.out.println("was not sorted");
    }
    
}
