// example showing the concept of Exception Handling

class Demo6{
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5};
        String str = "Andrew";

/*
        try{
            System.out.println("arr[30] : "+arr[30]);
            System.out.println("str.charAt(3) : "+str.charAt(30));
        }catch(IndexOutOfBoundsException e){
            System.out.println("Exception : "+e);
        }
*/
/*
      try{
            System.out.println("arr[3] : "+arr[3]);
            System.out.println("str.charAt(3) : "+str.charAt(30));
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception : "+e);
        }catch(StringIndexOutOfBoundsException e){
            System.out.println("Exception : "+e);
        }
*/
      try{
            System.out.println("arr[3] : "+arr[3]);
            System.out.println("str.charAt(3) : "+str.charAt(30));
        }catch(ArrayIndexOutOfBoundsException | StringIndexOutOfBoundsException e){
            System.out.println("Exception : "+e);
        }
    }
}