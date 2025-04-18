// Program 
class Demo3{
    void test(String name,int...var){
        System.out.println("Length : "+(var.length+1));
        System.out.print(name+"\t");
        for(int element : var){
            System.out.print(element+"\t");
        }
        System.out.println();
    }
    public static void main(String args[]){
        Demo3 obj = new Demo3();
        obj.test("demo1",10);
        obj.test("demo2",10,20);
        obj.test("demo3",10,20,30);
        obj.test("demo4",10,20,30,40);
        obj.test("demo5",10,20,30,40,50);
    }
}