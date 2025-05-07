// Example showing the concept of multi dimensional array
/*
    1d array 
     int arr[] = new int[5];

    2d array
     int arr[][] = new int[3][3];

    multi dimensional array : It is a collection of 2d array

     int arr[][][] = new int[no.of 2d array][no. of rows][no. of columns];
     int arr[][][] = new int[2][3][3];
                           __|_______
                          |          |
                        1 2 3      2 3 4
                        3 4 5      8 7 8
                        3 2 3      3 2 2 
                            3x3        3x3
*/
import java.util.Scanner;
class Demo17{
    public static void main(String args[]){
        int arr[][][] = new int[2][3][3];
        int count=1;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<3;j++){
                for(int k=0;k<3;k++){
                    arr[i][j][k] = count++; 
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