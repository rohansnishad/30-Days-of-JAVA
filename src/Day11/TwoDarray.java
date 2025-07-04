package Day11;
import java.util.*;

public class TwoDarray {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int [][] arr = new int[3][3];
        System.out.println("Enter the elements of Array");

        for (int i = 0;i<arr.length;i++){
            for (int j = 0;j< arr.length;j++){
                arr[i][j]= sc.nextInt();
            }
        }

        for (int i =0;i< arr.length;i++){
            for (int j=0;j< arr.length;j++){
                System.out.println(arr[i][j]+ " ");
            }
        }

        System.out.println("Diagonal of Matrix");
        //For printing Diagonal of matrix
        for (int i =0;i< arr.length;i++){
            System.out.print(arr[i][i]+" ");
        }

    }
}
