package Day6;

class student{
    int roll;
    String name;
    float percentage;

    void details(){
        System.out.println(name);
        System.out.println(roll);
        System.out.println(percentage);
    }
    void ispassed(){
        if (percentage>40){
            System.out.println(name+" Have Passed");
        }
        else
            System.out.println(name+" Have Failed");
    }

}

public class practice extends student{
    public static void main(String[] args){

        student s1 = new student();
        s1.name = "Ram";
        s1.roll = 21;
        s1.percentage = 50.0f;

        s1.details();
        s1.ispassed();
    }
}
