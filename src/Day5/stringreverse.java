package Day5;

public class stringreverse {
    public static void main(String[] args){
        String name = "java";
        String reverse ="";

        for (int i = name.length()-1;i>=0;i--){
            reverse += name.charAt(i);
        }
        System.out.println("Main text  "+name);
        System.out.println("Reversed text  "+reverse);
    }
}
