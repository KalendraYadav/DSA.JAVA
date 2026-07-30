package TWOsum8;

public class twosum1 {
    public static void main(String[] args){
        int[] hrr={4,58,2,1,10,56,-9,-8,-45,1,2};
        int target=6;
        boolean flag = false;
        for(int i=0;i<hrr.length;i++){
            
            for(int j=i+1;j<hrr.length;j++){
                if(hrr[i]+hrr[j]==target){
                    System.out.println("the two numbers are "+hrr[i]+" and "+hrr[j]);
                    flag= true;
                    break;
                }

            }
        }
        if(flag==false){
            System.out.println("no such numbers found");
        }
    }
    
}
