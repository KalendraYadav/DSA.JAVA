package DSApractice;

public class goodarray3 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        
        System.out.println(check(arr));
    }
    public static boolean check(int[]arr){
        int n=arr.length;
         int max=0;
         for(int ele :arr){
            max=Math.max(max, ele);
         }

         if(n!=max+1)
            return false;

         //checkig the frequency of the elment

         int freq[]=new int[max+1];
         for(int ele :arr)
            freq[ele]++;

         //check if all frequency is one 
         for(int i=1;i<max;i++){
            if(freq[i]!=1)
                return false;
         }

         //check if last frequency is two
         return freq[max]==2;
    }
    
}
