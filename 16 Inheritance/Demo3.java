// example showing the concept of Inheritance

class Parent{
    Parent(){
        System.out.println("parent constructor called");
    }
}
class Child extends Parent{
    static{
        System.out.println("static block");
    }
    {
        System.out.println("initializer block");
    }
    Child(){
        // super();
        // initializer block
        System.out.println("child constructor called");
    }
}
class Demo3{
    public static void main(String args[]){
        Child cobj = new Child();
    }
}