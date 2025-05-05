// program showing the concept of jagged array
import java.util.Scanner;
class Demo12{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows : ");
        int rows = sc.nextInt();
        int arr[][] = new int[rows][];

        for(int i=0;i<rows;i++){
            System.out.println("Enter columns for "+(i+1)+" row : ");
            int cols = sc.nextInt();
            arr[i] = new int[cols];
                System.out.println("Enter array elements : ");
                for(int j=0;j<cols;j++){
                    arr[i][j] = sc.nextInt();
                }            
        }
        System.out.println("Array elements are : ");
        for(int ar[] : arr){
            for(int element : ar){
                System.out.print(element+"\t");
            }
            System.out.println();
        }
    }
}