package Day3;
import java.util.*;

public class arrays {
    static public void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int[] arrs = {1,2,3,4,5};  //Normal Way of Defining The Array
        System.out.println("Enter the length of Array");
        int [] arr = new int[sc.nextInt()];

        System.out.println("Enter the elements of Array");
        for (int i=0;i< arr.length;i++)
            arr[i]=sc.nextInt();

        for (int i=4;i>=0;i--){
            System.out.print(arrs[i]+" ");
        }
        System.out.println(" ");
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
