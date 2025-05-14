// example showing the concept of static keyword
class Demo{
    static int b = 200;
}
class Demo8{
    static int a = 100;
    public static void main(String args[]){
        System.out.println("a : "+Demo8.a);
        System.out.println("a : "+a);
        System.out.println("b : "+Demo.b);
    }
}