// Program 
class Demo2{
    void test(int...var){
        System.out.println("Length : "+var.length);
        for(int element : var){
            System.out.print(element+"\t");
        }
        System.out.println();
    }
    public static void main(String args[]){
        Demo2 obj = new Demo2();
        obj.test(10);
        obj.test(10,20);
        obj.test(10,20,30);
        obj.test(10,20,30,40);
        obj.test(10,20,30,40,50);
    }
}