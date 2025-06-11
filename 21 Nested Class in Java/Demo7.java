// example showing the concept of nested class in java 
// non-static nested class (Inner Class) | Local class

class EnclosingClass {
    void show(){
        System.out.println("Show method called");
        class NestedClass{
            void display(){
                System.out.println("display method called");
            }
        }
        NestedClass obj = new NestedClass();
        obj.display();
    }
}
class Demo7{
    public static void main(String args[]){
       EnclosingClass obj = new EnclosingClass();
       obj.show();
    }
}