//time limit exceeded in this code.
package DSApractice;

public class twosumboolean3 {
    public static void main(String[] args) {
        int [] arr={4,-5,6,5,-8,2};
        int target=6;
       boolean ans= twosum(arr,target);
        // System.out.println(twosum(arr,target));
        System.out.println(ans);
    }

    public static boolean twosum(int arr[] , int target){
        // int found=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    // found=1;
                    return true;  //note: return also breaks the function so no need to worry about else case.
                }
            }
        }
        // if(found==0) return false;
        // else return true;
        return false;
    }
    
}
