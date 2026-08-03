package CHAPTER8;

public class next2 {
    public static void main(String[] args) {
        int [] arr={5,4,8,6,3,2};
        for(int kali : arr){
         kali*=2;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        // for(int kali :arr){
        //     System.out.print(kali+" ");
        // }
    }
    
}
