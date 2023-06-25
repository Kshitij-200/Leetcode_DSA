package s;

import java.util.Arrays;

public class matrix {
    public static void main(String[] args) {
        int [][] matrix = {
                {10, 100, 30, 40},
                {15, 25, 35, 45},
                {-645, 290, 37, 49},
                {3, 344 , 3831135 , 50}
        };
        int k = 8;
        int count = 0;
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                count++;
            }
        }

        System.out.println(count);


//        Arrays.sort(mix);
//
//        System.out.println(mix[k]);



    }
}
