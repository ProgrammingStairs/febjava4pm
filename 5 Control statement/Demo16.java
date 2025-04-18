// program showing the concept of switch control statement
import java.util.Scanner;
class Demo16{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter vowel : ");
        char vowel = sc.next().charAt(0);
        switch(vowel){
            case 'a' : System.out.println("Its a vowel");
                        break;
            case 'e' : System.out.println("Its a vowel");
                        break;
            case 'i' : System.out.println("Its a vowel");
                        break;
            case 'o' : System.out.println("Its a vowel");
                        break;
            case 'u' : System.out.println("Its a vowel");
                        break;
            case 'A' : System.out.println("Its a vowel");
                        break;
            case 'E' : System.out.println("Its a vowel");
                        break;
            case 'I' : System.out.println("Its a vowel");
                        break;
            case 'O' : System.out.println("Its a vowel");
                        break;
            case 'U' : System.out.println("Its a vowel");
                        break;
            default : System.out.println("Not a vowel");
                        break;
        }
    }
}