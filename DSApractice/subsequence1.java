package DSApractice;

public class subsequence1 {
    public static void main(String[] args) {
        String s="acb";
        String t="aghbfc";
        char[] arr1=s.toCharArray();
        char [] arr2=t.toCharArray();

        int n=arr1.length;
        int m=arr2.length;
        int small=Math.min(n,m);

        int p1=0;
        int p2=0;
        int count=0;
        while(p1<n&&p2<m){
            if(arr1[p1]==arr2[p2]){
                count++;
                p1++;
                p2++;
            }
            else if(m>n)  //it will fail in case we have to string of same length but not same element
                p2++;
            else if(n>m)
                p1++;
        }

        if(count==small)
            System.out.println("subsequece hai");
        else System.out.println("not a subsequence");
    }
    
}
