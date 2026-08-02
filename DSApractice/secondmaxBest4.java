package DSApractice;
public class secondmaxBest4 {

    public static void main(String[] args) {
        int [] arr={50,50,49,7,-8,4,-2,3,6,-9,45,23,23,22,45,7};
        System.out.println(best(arr)); 
    }

    public static int best(int []arr){
        int max=arr[0];
        int smax=arr[1];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                smax=max;
                max=arr[i];
            }
            else if(arr[i]>smax && arr[i]<max){
                smax=arr[i];
            }

        }
        return smax;
    }
}
