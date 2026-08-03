package multiplyarray8;

public class maxelement3 {
    public static void main(String[] args){
        int [] trr={52,9,-6,2,3,0,78,-1,5,6,7};

        int max=Integer.MIN_VALUE;
        for(int i=0;i<trr.length;i++){
            if(trr[i]>max){
                max=trr[i];
            }
        }
        System.out.println("the maximum element in the array is"+max);
    }
    
}
