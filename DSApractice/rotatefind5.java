//but what if the array is already sorted but not rotated then this code will not work we need another


package DSApractice;

public class rotatefind5 {
    public static void main(String[] args) {
        int arr[]={4,5,6,7,1,2,3};
        int n=arr.length;
        int breakpoint=0; //a initially sorted array should have max of only one breakpoint and last element of the array should be less than the first element


        for(int i=0;i<n-1;i++){
            if(arr[i+1]>arr[i]){
              continue;
            }
            else{
                breakpoint++;
                }
            
        }

        if(breakpoint==1 && arr[n-1]<arr[0]) System.out.print("array was initially sorted");
        else System.out.print("array was not sorted");
    }
    
}
