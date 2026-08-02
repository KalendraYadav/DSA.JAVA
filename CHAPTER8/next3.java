package CHAPTER8;

public class next3 {
    public static void main(String[] args) {
        int arr[]={4,5,2,1,7,8,5};
        for(int i=0;i<arr.length;i++){
            arr[i]*=2;

        }
        for(int ele: arr){
            System.out.print(ele+" ");
        }
    }
    
}
