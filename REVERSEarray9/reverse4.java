package REVERSEarray9;

public class reverse4 {
    public static void main(String[] args) {
        int [] arr={2,1,3,4,5,6,8,7,-9,5};
        int i=0,j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for(int ele:arr)
            System.out.print(ele+ " ");
    }
    
}
