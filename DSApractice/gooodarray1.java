package DSApractice;

public class gooodarray1 {
    public static void main(String[]args) {
        
        int arr[]={1,2,3,4,5,6,7,8};
        int n=arr.length;
        int max=0;
        for(int i=0;i<n;i++){
          max= Math.max(max, arr[i]); 
        }

        //check the first condition 
         if(n!=max+1){
             System.out.println("false hai jii , size equal nahi hai max+1 ka");
           return;
           
         }

         int freq[]=new int[max+1];//array index start from 0 so to store the last max element we have size max+1 not max.
         for(int i=0;i<n;i++){
            freq[arr[i]]++;
         }

        //check if all the frequency are one for all element
        for(int i=1;i<max;i++){ //max se ekk kam tk jao , last wala ka frequency 2 hai isliye
            if(freq[i]!=1) {
                System.out.println("false hai jii ,freq sab ka 1 nahi hai");
            return;
            }

        }

        if(freq[max]!=2){
            System.out.println("false hai jii, max element ka freq 2 nahi hai");
        return;
        } 
        
        
            System.out.println("true hai jiii");

           }
    
}
