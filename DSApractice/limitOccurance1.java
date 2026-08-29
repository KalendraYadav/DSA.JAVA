package DSApractice;


public class limitOccurance1 {
    public static void main(String[] args) {
        int arr[]={1,1,1,1,2,2,3,3,3,4,5,5};
        int k=2;
        int n=arr.length;
        int freq[]=new int[n];
        int out[]=new int[n];

        //counting the frequency
        for(int ele:arr){
            freq[ele]++;

        }
        //discarding the extra freq
        for(int i=1;i<n;i++){
            if(freq[i]>k)
                freq[i]=k;
            else
                continue;
        }

        //priting the actual array
        
        int ind=0;
        int i=1;
        while(freq[i]!=0){
            for(int j=1;j<=freq[i];j++){
                out[ind]=i;
                ind++;
            }
            i++;
        }


        //print the final array

        //can not use for each loop it will also print the zero 

        // for(int ele:out){
        //     System.out.print(ele+" ");
        // }
        int l=0;
        while(out[l]!=0){
            System.out.print(out[l]+" ");
            l++;

        }
    }
    
}
