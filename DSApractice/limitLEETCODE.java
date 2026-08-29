class Solution {
    public int[] limitOccurrences(int[] nums, int k) {

        int n=nums.length;
        int freq[]=new int[n];
        int out[]=new int[n];

        //counting the frequency
        for(int ele:nums){
            freq[ele]++;

        }
        for(int i=1;i<n;i++){
            if(freq[i]>k)
                freq[i]=k;
            else
                continue;
        }
        
        int ind=0;
        int i=1;
        while(freq[i]!=0){
            for(int j=1;j<=freq[i];j++){
                out[ind]=i;
                ind++;
            }
            i++;
        }

      for(int l=0;l<n;l++){
        if(out[l]==0)
        break;
        else
        continue;
      }
      return out;
    }
}
        
    