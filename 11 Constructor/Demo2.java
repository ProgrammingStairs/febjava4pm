// Example showing the concept of constructor

class Demo2{
    Demo2(){
        int rno = 102;
        double per = 56.67;
        String name = "Andrew Anderson";
        System.out.println("Roll Number : "+rno);
        System.out.println("Percentage : "+per);
        System.out.println("Name : "+name);
    }
    public static void main(String args[]){
        new Demo2(); // anonymous object
    }
}