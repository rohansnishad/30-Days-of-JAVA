package Day2;
import java.util.*;

public class switchs {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello, Here we tell you about your Current mood");
        System.out.println("Enter any No. between 1 to 5");
        int num = sc.nextInt();

        if(num>5){
            System.out.println("You have select wrong No.");
        }
        else{
            switch(num){
                case 1:
                    System.out.println("Happy in Life");
                    break;
                case 2:
                    System.out.println("Sad in Life");
                    break;
                case 3:
                    System.out.println("Enjoying your Life");
                    break;
                case 4:
                    System.out.println("Struggling in Life");
                    break;
                case 5:
                    System.out.println("Motivated and Goal Oriented");
                    break;
            }
        }
    }
}
