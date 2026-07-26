package sortingbybuiltin6;

public class sorting2 {
    public static void output(int[] krr){
        for(int i=0;i<krr.length;i++){
            System.out.print("  "+krr[i]);
        }
    }

    public static void main(String[] args){
        int [] m= {4,7,89,5,-63,1,0,25,12,-1};
        output(m);
        System.out.println("   \nafter sorting");
        java.util.Arrays.sort(m);
        output(m);
    }
    
}
