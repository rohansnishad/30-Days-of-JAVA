package Day11;
import java.util.*;

public class operations {
    public static void main(String[] args){

        int [][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        System.out.println("Original Matrix :- ");
        for (int i=0;i< arr.length;i++){
            for (int j=0;j<arr.length;j++){
                System.out.println(arr[i][j]+ " ");
            }
        }

        System.out.println("Transpose Matrix :- ");
        for (int i =0;i< arr.length;i++){
            for (int j=0;j< arr.length;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

    }
}
