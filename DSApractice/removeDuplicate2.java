package DSApractice;
public class removeDuplicate2{
    public static void main(String[] args) {
        
        int arr[]={-4,-4,-3,-2,-2,-2,-1,0,1,2,2,2,3,3,4,4,4,4,5};
        int n=arr.length;
        int ans[]=new int[n];

        ans[0]=arr[0];
        int ind=1;
        for(int i=1;i<n;i++){
            if(arr[i]==arr[i-1] )
                continue;
            else{
                ans[ind]=arr[i];
                ind++;
            }
        }

        //counting the element that are unique
        int m=ans.length;
        for(int i=1;i<n;i++){
            if(ans[i]<ans[i-1]){
                m=i;
                break;
            }
        }


        //print the value
        System.out.println("the unique elements are"+m);
    }
}
