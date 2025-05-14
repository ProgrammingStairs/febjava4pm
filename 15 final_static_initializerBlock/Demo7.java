// example showing the concept of static keyword
// static block
class Demo{
    static{
        System.out.println("static block");
    }
}
class Demo7{
    public static void main(String args[]){
        Demo obj = new Demo();
        System.out.println("Main Method");
        Demo obj1 = new Demo();
    }
}