// program showing the concept of Array
class Demo1{
    public static void main(String args[]){
        // int arr[] = {1,2,3,4,5};
        int arr[] = new int[]{1,2,3,4,5};
        
        System.out.println("arr[0] : "+arr[0]);
        System.out.println("arr[1] : "+arr[1]);
        System.out.println("arr[2] : "+arr[2]);
        System.out.println("arr[3] : "+arr[3]);
        System.out.println("arr[4] : "+arr[4]);

        System.out.println("\nArray elements are : \n");
        for(int i=0;i<arr.length;i++){
            System.out.println("arr["+i+"] : "+arr[i]); 
        }        

        System.out.println("\nArray elements are : \n");
        for(int element : arr){
            System.out.println("element : "+element); 
        }        
    }
}