package multiplyarray8;

public class minimumelement2 {
    public static void main(String[] args){
        int [] prr={52,9,-6,2,3,0,78,-1,5,6,7};
        int min= prr[0];
        for(int i=0;i<prr.length;i++){
            if(prr[i]<min){
                min=prr[i];
            }
        }

        System.out.println("the minimum element in the array is"+min);
    }
    
}
