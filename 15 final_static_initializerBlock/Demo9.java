// example showing the concept of static keyword
class Demo{
    static void show(){
        System.out.println("static method called of Demo");
    }
}
class Demo9{
    static void display(){
        System.out.println("static method called");
    }
    public static void main(String args[]){
        Demo9.display();
        display();
        Demo.show();
    }
}