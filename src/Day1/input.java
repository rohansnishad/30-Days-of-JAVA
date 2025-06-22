package Day1;
import java.util.Scanner;

public class input {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name ");
        String Name = sc.nextLine();
        System.out.println("Enter your Age");
        int Age = sc.nextInt();
        System.out.println("Enter your CGPA");
        float Cgpa = sc.nextFloat();
        System.out.println("Are you Student");
        boolean Student = sc.nextBoolean();

        System.out.println("Name "+Name);
        System.out.println("Age "+Age);
        System.out.println("Cgpa "+Cgpa);
        System.out.println("Student Status "+Student);
    }
}
