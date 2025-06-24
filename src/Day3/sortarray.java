package Day3;
import java.util.*;
import java.lang.reflect.Array;

public class sortarray {
    public static void main(String[] args){

        int[] arr ={2,43,53,344,10};

        Arrays.sort(arr);
        for (int j=0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }
    }
}
