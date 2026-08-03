package searchinarray7;

public class find2 {
    public static void main(String[]args){
        int []arr={4,58,2,56,1,0,56,-9,-8,-45,1,2};
        int x=4;

        int found = -1; //index can not be negative so we can take any number that is negative 
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                found=i;
                break;
            }
        }
        if(found==-1){
            System.out.println("not found");
        }
        
        else{
            System.out.println("found at index "+found);
        }
    }
    
}
