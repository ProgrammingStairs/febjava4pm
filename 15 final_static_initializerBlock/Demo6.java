// example showing the concept of static keyword
// static block
class Demo6{
    // static initializer block
    static{
        System.out.println("statement 1");
    }
    public static void main(String args[]){
        System.out.println("Main Method");
    }
    static{
        System.out.println("statement 2");
    }
}