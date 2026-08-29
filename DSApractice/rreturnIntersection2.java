package DSApractice;
import java.util.Arrays;
public class rreturnIntersection2 {

    public static void main(String[] args) {
          int nums1[]={1,1,3,2,3,4};
        int nums2[]={2,3};
        int [] result =check(nums1, nums2);


        for(int ele:result)
            System.out.print(ele+" ");
    }
    public static int[] check(int [] nums1, int [] nums2) {
      
        int n=nums1.length;
        int m=nums2.length;
        int small= Math.min(n,m);

        int p1=0;
        int p2=0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int ans[]=new int[small];

        int ind=0;
        while(p1<n&& p2<m){
            if(nums1[p1]==nums2[p2]){
                ans[ind]=nums1[p1];
                ind++;
                p1++;
                p2++;
            }
            else if(nums1[p1]<nums2[p2]){
                p1++;
            }
            else
                p2++;
        }

        return Arrays.copyOf(ans,ind);
    }
    
}
