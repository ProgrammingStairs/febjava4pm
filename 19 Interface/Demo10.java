// program showing the concept of Interface
/*
interface Showable{
    int a = 100;
}
class Demo10{
    public static void main(String args[]){
        System.out.println("value of a : "+Showable.a);
    }
}
*/
interface Showable{
    int a = 100;
}
class Demo10 implements Showable{
    public static void main(String args[]){
        System.out.println("value of a : "+a);
    }
}