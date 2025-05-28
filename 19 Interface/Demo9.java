// program showing the concept of Interface

interface Showable{
    int age=18;
    void age();
}
class Demo9{
    public static void main(String args[]){
        Showable obj = new Showable(){
            @Override
            public void age(){
                System.out.println("Age : "+age);
            }
        };
        obj.age();
    }
}