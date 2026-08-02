package DSApractice;
public class secondmaxBest4 {

    public static void main(String[] args) {
        int [] arr={50,50,49,7,-8,4,-2,3,6,-9,45,23,23,22,45,7};
        System.out.println(best(arr)); 
    }
    //will fail in case if the first two elements will be largest.

    public static int best(int []arr){
        int max=Integer.MIN_VALUE;  //we can not store 0 th or 1th element here as if the
        //largest repeated element will be in the starting then the loop will not run even once.
        int smax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>smax && arr[i]<max){
                smax=arr[i];
            }
        }
        return smax;
    }
}