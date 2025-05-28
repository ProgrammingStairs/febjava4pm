// program showing the concept of Interface

interface Showable{
    void display();
}
class NormalClass implements Showable{
    @Override
    public void display(){
        System.out.println("display method called");
    }
}
class Demo7{
    public static void main(String args[]){
        NormalClass obj = new NormalClass();
        obj.display();
    }
}