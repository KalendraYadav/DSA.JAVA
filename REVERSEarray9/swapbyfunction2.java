package REVERSEarray9;

public class swapbyfunction2 {
    public static void main(String[] args) {
        int []arr={5,4,2,8,6,3,7,1,5};
       int[] brr= swap(arr);
       for(int ele: brr){
        System.out.print(ele+" ");
       }
    }
    
    public static int[] swap(int[] arr){
       for(int i=0;i<arr.length/2;i++){
    
            int temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
            
       }
       return arr;
    }
}
