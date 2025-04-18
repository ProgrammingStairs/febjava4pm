// program to take values from user
import java.util.Scanner; // step 1
class Demo1{
    public static void main(String args[]){
        // creating object of Scanner class
        Scanner sc = new Scanner(System.in); // step 2
        
        System.out.println("Enter First Number : ");
        int first = sc.nextInt(); // step 3  taking integer value from user
        
        System.out.println("Enter Second Number : ");
        int second = sc.nextInt();
        
        int sum = first+second;
        System.out.println("Sum : "+sum);
    }
}