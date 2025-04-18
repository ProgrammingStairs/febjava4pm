// example showing the concept of do while loop
import java.util.Scanner;
class Demo15{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num,sum=0;
        char ch;
        do{
            System.out.println("Enter Number : ");
            num = sc.nextInt();
                sum+=num;
            System.out.println("Do you want to continue ? \n If Yes Press y/Y : ");
            ch = sc.next().charAt(0);
        }while(ch=='y' || ch=='Y');
        System.out.println("Sum : "+sum);
    }   
}