package Day3;
import java.util.*;

public class largeno {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length of Array");
        int[] no = new int[sc.nextInt()];

        System.out.println("Enter the elements of Array");
        for (int i=0;i<no.length;i++){
            no[i]= sc.nextInt();
        }

        int max = no[0];
        for (int j=0;j<no.length;j++){
            if (no[j]>max){
                max=no[j];
            }
        }
        System.out.println("Max No. "+max);

        int min = no[1]; // = no[1]
        for (int i=0;i<no.length;i++){
            if (no[i]<min){
                min=no[i];
            }
        }
        System.out.println("Min No. "+min);

        int neg = no[2];
        for (int i=0;i<no.length;i++){
            if (no[i]<0){
                neg=no[i];
            }
        }
        System.out.println("The Negative No. in the Array is  "+neg);
    }
}
