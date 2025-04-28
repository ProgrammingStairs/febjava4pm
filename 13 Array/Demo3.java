// program to find out sum of first and last element of an array
import java.util.Scanner;
class Demo3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        
        System.out.println("\nEnter Array elements : \n");
        for(int i=0;i<arr.length;i++){
             arr[i] = sc.nextInt();
        }        

        System.out.println("\nSum : "+(arr[0]+arr[size-1]));
    }
}