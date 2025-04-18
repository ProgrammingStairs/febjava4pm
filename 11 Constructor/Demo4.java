// Example showing the concept of constructor
// this can also be passed as an argument inside constructor
class Demo{
    String name;
    Demo(Demo4 object){
        this.name=object.name;
    }
    void display(){
        System.out.println("Name : "+name);
    }
}
class Demo4{
    String name="Andrew Anderson";
    Demo4(){
        Demo obj = new Demo(this);
        obj.display();
    }
    public static void main(String args[]){
        new Demo4();
    }
}