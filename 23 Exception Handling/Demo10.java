// example showing the concept of Exception Handling

class Demo10{
    public static void main(String args[]){
        try{
            Class.forName("Demo11");
            System.out.println("Class Found");
        }catch(ClassNotFoundException e){
            System.out.println("Exceotion : "+e);
        }
    }
}