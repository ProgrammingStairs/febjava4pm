//  Example showing the concept of run time polymorphism 

class Parent{
    String name = "Andrew Anderson";
    void display(){
        System.out.println("display method of parent called");
    }
    void draw(){
        System.out.println("draw method of parent called");
    }
}
class Child extends Parent{
    String name = "Peter Parker";
    @Override
    void display(){
        System.out.println("display method of child called");
    }
    void view(){
        System.out.println("view method of child called");
    }
}
class Demo7{
    public static void main(String args[]){
        Parent obj = new Child(); // upcasting
        obj.display();
        obj.draw();
        System.out.println("Parent name : "+obj.name);
        Child cobj = (Child)obj;// downcasting
        cobj.view();
        System.out.println("Child name : "+cobj.name);
    }   
}