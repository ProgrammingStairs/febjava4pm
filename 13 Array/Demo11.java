// program showing the concept of jagged array
class Demo11{
    public static void main(String args[]){
        int arr[][] = new int[5][];

        arr[0] = new int[]{1,2,3,4};
        arr[1] = new int[]{3,4,5,1,2,3,4};
        arr[2] = new int[]{1,2,4};
        arr[3] = new int[]{1,2,7,7,3,4};
        arr[4] = new int[]{1,2,3,4,3,2,3,4,4,4};

        System.out.println("Array elements are : ");
        for(int ar[] : arr){
            for(int element : ar){
                System.out.print(element+"\t");
            }
            System.out.println();
        }
    }
}