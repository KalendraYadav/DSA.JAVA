package DSApractice;

public class rotatearrayM27 {

    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,6,7};
        int k=3;
       int [] brr= rotate(arr,k);
       for(int i=0;i<arr.length;i++){
        System.out.print(brr[i]+" ");
       }
    }

    public static int [] rotate(int arr[], int k){
       
  for(int i=0;i<k;i++){
            for(int j=0;j<arr.length-1;j++){
            int temp=arr[arr.length-1-j];
                arr[arr.length-1-j]=arr[arr.length-2-j];
            arr[arr.length-2-j]=temp;
        }
    }
    return arr;
}
}








