package ARRAY;

public class minelement {
    public static void main(String[]args){
        int [] krr={1,45,5,-2,-5,7};

        int min=krr[0];
        for(int i=0;i<krr.length;i++){
            if(krr[i]<min){
                min=krr[i];
            }
        }
        System.out.println(min);
    }
    
}
