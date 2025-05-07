// Example showing the concept of multi dimensional array
import java.util.Scanner;
class Demo18{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of 2d array : ");
        int n = sc.nextInt();
        System.out.println("Enter no. of rows : ");
        int r = sc.nextInt();
        System.out.println("Enter no. of columns : ");
        int c = sc.nextInt();
        System.out.println("Enter array elements : ");
        int arr[][][] = new int[n][r][c];
        int count=1;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<r;j++){
                for(int k=0;k<c;k++){
                    arr[i][j][k] = sc.nextInt(); 
                }
            }
        }
        System.out.println("Array elements are : ");
        for(int ar[][] : arr){
            for(int a[] : ar){
                for(int element : a){
                    System.out.print(element+"\t");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}