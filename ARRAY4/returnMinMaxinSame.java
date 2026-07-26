package ARRAY;

public class returnMinMaxinSame {
    public static int[] max(int[] prr){  
        
        int max=prr[0];
        int min=prr[0];
        for(int i=0;i<prr.length;i++){
            if(prr[i]>max){
                max=prr[i];
            }
            if(prr[i]<min){
                min=prr[i];
            }
        }
    
        return new int [] {min,max};
    }

    public static void main(String[]args){
     int [] result= max(new int[]{1,2,3,4,5,6,7,8,9});
    System.out.println("the minimum value is "+ result[0]);
    System.out.println("the maximum value is "+ result[1]);
    }
}