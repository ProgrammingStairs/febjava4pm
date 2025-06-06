// example showing the concept of nested class in java 
// non-static nested class (Inner class) 

class EnclosingClass {
    private int a = 100;
    protected String name = "Andrew Anderson";
    static float b = 23.34f;
    class NestedClass{
        void display(){
            System.out.println("display method called");
            System.out.println("value of a : "+a);
            System.out.println("value of b : "+b);
            System.out.println("value of name : "+name);
        }
    }
    public static void main(String args[]){
        EnclosingClass eobj = new EnclosingClass();
        NestedClass obj = eobj.new NestedClass();
        obj.display();
    }
}