package DSApractice;

public class twosumm3 {
    public static void main(String[] args){
        int arr[]={1,3,6,8,17,45,51};
        int n=7;
        int target=51;
        int result[]=new int[2];
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    result[0]=i;
                    result[1]=j;
                }
            
            }
        }

        for(int i=0;i<2;i++){
            System.out.print(result[i]+" ");
        }
    }
    
}
