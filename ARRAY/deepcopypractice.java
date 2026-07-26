package ARRAY;
public class deepcopypractice{
    public static void main(String[]args){
        int [] j={4,5,4,7,8,9,6,2,3,0};

        int[] k=j.clone();  //deep copy ka dusra method
        k[3]=14;
        System.out.println(j[3]); //iska value 7 aayega 14 nahi.
        System.out.println(k[3]); //iska value 14 aayega 7 nahi.
        System.out.println(k[4]);
        

    }
}