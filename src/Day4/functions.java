package Day4;
import java.util.*;

public class functions {

    public static float avg(int a, int b){
        return a + b / 2;
    }

    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter two Numbers");
      int a = sc.nextInt();
      int b = sc.nextInt();

      float avg = avg(a,b);
      System.out.println("The average of given two no. is   "+ avg);

    }

}
