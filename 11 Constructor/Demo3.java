// Example showing the concept of constructor
class Demo3{
    int rno;
    double per;
    String name;
    Demo3(){
        rno = 102;
        per = 56.67;
        name = "Andrew Anderson";
    }
    void display(){
        System.out.println("Roll Number : "+rno);
        System.out.println("Percentage : "+per);
        System.out.println("Name : "+name);
    }
    public static void main(String args[]){
        Demo3 obj = new Demo3();
        obj.display();    
    }
}