// example showing the concept of nested class in java 
// static nested class 

class EnclosingClass {
    static private int a = 100;
    static protected String name = "Andrew Anderson";
    static void show(){
        System.out.println("show method called");
    }
    static{
        System.out.println("static block of Enclosing class executes");
    }
    static class NestedClass{
        static{
            System.out.println("static block of Nested class executes");
        }
        void display(){
            System.out.println("display method called");
            show();
            System.out.println("value of a : "+a);
            System.out.println("value of name : "+name);
        }
    }
}
class Demo3{
    static{
        System.out.println("static block of Demo3 class executes");
    }
    public static void main(String args[]){
        EnclosingClass.NestedClass obj = new EnclosingClass.NestedClass();
        obj.display();
    }
}