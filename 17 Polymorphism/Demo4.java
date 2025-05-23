//  Example showing the concept of polymorphism 
// method overriding

class Parent{
    void display(){
        System.out.println("display method of parent called");
    }
}
class Child extends Parent{
    @Override
    void display(){
        System.out.println("display method of child called");
    }
}
class Demo4{
    public static void main(String args[]){
        Child obj = new Child();
        obj.display();
    }   
}