// program showing the concept of Interface

interface Showable{
    int age=18;
    void age();
}
class GetAge implements Showable{
    @Override
    public void age(){
        System.out.println("Age : "+age);
    }
}
class Demo8{
    public static void main(String args[]){
        Showable obj = new GetAge();
        obj.age();
    }
}