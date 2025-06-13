// example showing the concept of Exception Handling

class Demo7{
    static String name;
    public static void main(String args[]){
      try{
            System.out.println("length : "+name.length());
        }catch(NullPointerException e){
            System.out.println("Exception : "+e);
        }
    }
}