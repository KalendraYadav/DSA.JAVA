package ARRAY;

public class minmax2 {
    public static int [] minmax(int [] prr){
        int min=prr[0];
        int max=prr[0];
        for(int i=0;i<prr.length;i++){
            if(prr[i]>max){
                max=prr[i];
            }
            if(prr[i]<min){
                min=prr[i];
            }
        }
        return new int[] {min,max};
    }

    public static void main(String[]args){
        int [] finale=minmax(new int[]{1,5,8,23,9,-7,45});
        System.out.println("the minimum is"+ finale[0]);
        System.out.println("the maximum is"+ finale[1]);
    }
    
}
