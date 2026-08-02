package REVERSEarray9;

public class swapbywhileloop3 {
    public static void main(String[] args) {
        int []arr={5,4,2,8,6,3,7,1,5};
       int[] brr= swap(arr);
       for(int ele: brr){
        System.out.print(ele+" ");
       }
    }
    
    public static int[] swap(int[] arr){
        int i=0;
       while(i<(arr.length/2)){
    
            int temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
            i++;
            
       }
       return arr;
    }
}
