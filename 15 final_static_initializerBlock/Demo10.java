// example showing the concept of static keyword
class Demo10{
    static int count=0;
    Demo10(){
        count++;
    }
    static int getResult(){
        return count;
    }
    public static void main(String args[]){
        new Demo10();
        new Demo10();
        new Demo10();
        new Demo10();
        new Demo10();
        System.out.println("No. of objects created : "+getResult());
    }
}