package Day4;
import java.util.*;

public class voidfunction {

    public static void hello(){
        System.out.println("Hello");
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name");
        String name = sc.nextLine();
        hello();
        System.out.println(name);
    }
}
