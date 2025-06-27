package Day7;

class person{
    String name = "Ram";
    int age = 22;
    void showdetails(){
        System.out.println("Name  "+name);
        System.out.println("Age  "+age);

    }
}
class student extends person{
    int roll =24;
    int marks = 66;
    void showdetails(){
        System.out.println("Roll No.  "+roll);
        System.out.println("Marks  "+marks);
    }

}

public class practice extends student{
    public static void main(String[] args){
        person p = new person();
        student s = new student();
        p.showdetails();
        s.showdetails();
    }
}
