package DSApractice;
//it will fail if the num2 will become large 
public class returnIntersection1 {
    public static void main(String[] args) {
         int nums1[]={1,2,3,2,2};
        int nums2[]={2,2};
       int [] result= intersect(nums1,nums2);
       //printing the result

       for(int ele:result){
        System.out.print(ele+" ");
       }
        
    }
     public static int[] intersect(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int small=0;
        if(n<m) small=n;
        else small=m;

        int p1=0;
        int p2=0;
        int ans[]=new int[small];
           
        int ind=0;
        while(p2<small){
            if(nums1[p1]==nums2[p2]){
                ans[ind]=nums1[p1];
                p1++;
                p2++;
                ind++;
            }
            else{
                p1++;
            }
        }
        return ans;
    
}
}
