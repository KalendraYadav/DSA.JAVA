package DSApractice;

public class removeDuplicate1 {
    public static void main(String[] args) {
        int arr[]={0,0,1,1,1,2,2,3,3,3,3,4};
        int n=arr.length;
        int ans[]=new int[n];

        ans[0]=arr[0];
        int ind=1; //index for the ans array 
        for(int i=1;i<n;i++){
            if(arr[i]==arr[i-1])
                continue;
            else{ 
                ans[ind]=arr[i];
                ind++;
            }
        }
        int i=1;
        int element=1;//first element can be zero in the ans so we have started from the index 1 and has already kept one in the

        
        while(ans[i]!=0){ //we assumed the there is no any negative element in the array
          element++;
          i++;
        }
        System.out.println("the  non duplicate elment in the ans is"+element);
    
}
}