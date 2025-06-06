// example showing the concept of nested class in java 
// static nested class 

class EnclosingClass {
    static private int a = 100;
    static protected String name = "Andrew Anderson";
    static float b = 23.34f;
    static class NestedClass{
        void display(){
            System.out.println("display method called");
            System.out.println("value of a : "+a);
            System.out.println("value of b : "+b);
            System.out.println("value of name : "+name);
        }
    }
}
class Demo2{
    public static void main(String args[]){
        EnclosingClass.NestedClass obj = new EnclosingClass.NestedClass();
        obj.display();
    }
}