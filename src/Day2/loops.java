package Day2;
import java.sql.SQLOutput;
import java.util.*;

public class loops {
    public static void main(String[] args){

        System.out.println("Enter the number for which you want table");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();


        //For loop
//        for(int i=1;i<=10;i++){
//            System.out.println(num+"*"+i+"="+num*i);
//        }

        //While loop
//        int i =1;
//        while(i<=10){
//            System.out.println(num+"*"+i+"="+num*i);
//            i++;
//        }

        //Do while loop
        int i = 1;
        do {
            System.out.println(num+"*"+i+"="+num*i);
            i++;
        }while(i<=10);
    }
}
