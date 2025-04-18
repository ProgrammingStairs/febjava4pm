// reversing a number
import java.util.Scanner;
class Demo11{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = sc.nextInt();
        System.out.println("Original Number : "+num);
        int rev=0,rem;
        while(num>0){
            rem = num%10;
            rev = rev * 10 + rem;
            num = num/10;
        }
        System.out.println("Original Number after reverse : "+num);
        System.out.println("Reverse Number : "+rev);
    }
}

