// program showing the concept of switch control statement
import java.util.Scanner;
class Demo19{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter vowel : ");
        String vowel = sc.next().toLowerCase();
        String result = (vowel.equals("a") || vowel.equals("e") || vowel.equals("i") || vowel.equals("o") || vowel.equals("u")) ? "vowel" : "not a vowel";
        switch(result){
            case "vowel" : System.out.println("Its a vowel");
                        break;
            default : System.out.println("Not a vowel");
                        break;
        }
    }
}