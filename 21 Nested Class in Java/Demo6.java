// example showing the concept of nested class in java 
// non-static nested class (Inner Class) | Member class

class EnclosingClass {
    void show(){
        System.out.println("Show method called");
        NestedClass obj = new NestedClass();
        obj.display();
    }
    class NestedClass{
        void display(){
            System.out.println("display method called");
        }
    }
}
class Demo6{
    public static void main(String args[]){
       EnclosingClass obj = new EnclosingClass();
       obj.show();
    }
}