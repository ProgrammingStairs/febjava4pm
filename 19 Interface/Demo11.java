// program showing the concept of Interface
interface Movable{
    int a = 100;
}
interface Showable{
    int a = 200;
}
class Demo11{
    public static void main(String args[]){
        System.out.println("value of a : "+Movable.a);
        System.out.println("value of a : "+Showable.a);
    }
}