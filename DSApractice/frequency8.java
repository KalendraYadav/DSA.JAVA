package DSApractice;

import java.util.Arrays;

public class frequency8 {
    public static void main(String[] args) {

        int[] arr = {1,1,2,3,2,3,3,2,4,5};
        int[] freqArr = new int[arr.length];   // New array for frequencies

        for (int i = 0; i < arr.length; i++) {
            int m = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    m++;
                }
            }
            freqArr[i] = m;   // Store frequency here instead of arr[i]
        }

        Arrays.sort(freqArr);

        int freq = freqArr[freqArr.length - 1];

        for (int i = freqArr.length - 2; i >= 0; i--) {
            if (freqArr[i] == freqArr[freqArr.length - 1]) {
                freq += freqArr[i];
            } else {
                break;
            }
        }

        System.out.println("Total frequencies is " + freq);
    }
}