// Example showing the concept of constructor
// this can also be used to return class object
class Demo{
    String name;
    Demo(Demo5 object){
        this.name=object.name;
    }
    Demo display(){
        return this;
    }
    void printData(){
        System.out.println("Name : "+name);
    }
}
class Demo5{
    String name="Andrew Anderson";
    Demo5(){
        new Demo(this).display().printData();
    }
    public static void main(String args[]){
        new Demo5();
    }
}