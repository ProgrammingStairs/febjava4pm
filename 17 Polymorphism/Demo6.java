//  Example showing the concept of run time polymorphism 

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
class Demo6{
    public static void main(String args[]){
        Parent obj = new Child(); // upcasting
        obj.display();
    }   
}