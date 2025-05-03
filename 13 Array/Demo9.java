// program showing the concept of 2d array
class Demo9{
    public static void main(String args[]){
        int arr[][] = {
            {1,2,3},
            {3,4,5},
            {6,7,8}
        };

        System.out.println("Array elements are : ");
        for(int ar[] : arr){
            for(int element : ar){
                System.out.print(element+"\t");
            }
            System.out.println();
        }
    }
}