// example showing the concept of Inheritance

class Parent{
    Parent(){
        System.out.println("parent constructor called");
    }
}
class Child extends Parent{
    Child(){
        super();
        System.out.println("child constructor called");
    }
}
class Demo2{
    public static void main(String args[]){
        Child cobj = new Child();
    }
}