package Day5;

public class stringpallindrome {

        public static boolean ispallindrome(String a){
            int i = 0,j = a.length()-1;
            while(i<j){
                if (a.charAt(i)!=a.charAt(j)){
                    return false;
                }
                i++;
                j--;
            }
            return true;

        }

        public static void main(String[] args){

            String str = "maam";

        }

        //s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        // used to remove all the special character and space also make all the text in lowercase
}
