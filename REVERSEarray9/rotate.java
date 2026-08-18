package REVERSEarray9;

public class rotate {
    public static void main(String[] args) {
        int []arr={1,2,5,6,3,-4,5,8};
        int d=4;
        int n=arr.length;
        int arr2[]=new int[n];
        for(int i=0;i<n-d;i++){
           arr2[i]=arr[i+d];
        }

        System.out.print("hello");
        for(int i=0;i<d;i++){
            arr2[n-d-i]=arr[i];
        }



        for(int ele:arr2)
            System.out.print(ele+" ");

    }
}
