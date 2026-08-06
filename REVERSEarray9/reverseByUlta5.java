package REVERSEarray9;

public class reverseByUlta5 {
    public static void main(String[] args) {
         int [] arr={2,1,3,4,5,6,8,7,-9,5};
         int [] rev=new int[arr.length];
         int n=arr.length-1;
         
     for(int i=0;i<arr.length;i++){
        rev[i]=arr[n];
        n--;
     }
        for(int ele:rev)
            System.out.print(ele+" ");
    }
}
