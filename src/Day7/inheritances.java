package Day7;

class animals{
    animals(){
        System.out.println("Animals make sound");
    }
}

class dog extends animals{

    dog() {
        super();
        System.out.println("Dog Barks");
    }
}



public class inheritances extends dog{

     public static void main(String[] args) {
         animals a = new animals();
         dog d = new dog();

     }
}
