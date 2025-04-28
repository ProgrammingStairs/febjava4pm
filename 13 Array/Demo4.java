// program to find out sum of all the element of an array
import java.util.Scanner;
class Demo4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        
        int sum=0;
        System.out.println("\nEnter Array elements : \n");
        for(int i=0;i<arr.length;i++){
             arr[i] = sc.nextInt();
             sum = sum + arr[i];
        }        

        System.out.println("\nSum : "+sum);
    }
}