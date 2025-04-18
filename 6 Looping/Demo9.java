// odd numbers upto n
import java.util.Scanner;
class Demo9{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = sc.nextInt();
        num = num%2==0 ? num : num+1;
        for(int i=1;i<=num/2;i++){
            System.out.print(2*i-1+"\t");
        }
    }
}

