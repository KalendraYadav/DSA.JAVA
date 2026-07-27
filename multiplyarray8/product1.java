package multiplyarray8;

public class product1 {

    public static void main(String[] args){
        int [] krr={4,58,2,1,10,56,-9,-8,-45,1,2};

        int pro=1;
        for(int i=0;i<krr.length;i++){
            pro=krr[i]*pro;
        }
        System.out.println("the product of all the elements in the array is"+ pro);
    }
    
}
