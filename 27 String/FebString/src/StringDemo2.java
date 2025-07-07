import java.util.Scanner;
public class StringDemo2 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name : ");
        String fname = sc.next();

        sc.nextLine();
        System.out.println("Enter full name : ");
        String fullName = sc.nextLine();
        
        System.out.println("First Name : "+fname);
        System.out.println("Full Name : "+fullName);
    }
}
