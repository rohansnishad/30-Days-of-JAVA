package Day2;
import java.util.*;

public class conditional {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Expencess calculator");

        System.out.println("Enter location");
        String loc = sc.nextLine();
        System.out.println("Enter Flat rent");
        int rent = sc.nextInt();
        System.out.println("Enter traveling Expencess");
        int travel = sc.nextInt();
        System.out.println("Enter Food Expences");
        int food = sc.nextInt();
        System.out.println("Enter others");
        int other = sc.nextInt();

        int total = rent+travel+food+other;
        System.out.println("Here is your's total :-"+total);

        if (rent+travel>=30000){
            System.out.println("You are from High Class");
        } else if (rent+travel<=30000&&rent+travel>=20000) {
            System.out.println("Ypu are from Middle Class");
        }
        else{
            System.out.println("You are poor ");
        }

    }
}
