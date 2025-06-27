// Example showing the concept of Thread

class Demo10 implements Runnable{
    @Override 
    public void run(){
        System.out.println("run method executes : "+Thread.currentThread().getName());
    }
    public static void main(String args[]){
        Demo10 obj1 = new Demo10();
        Thread th = new Thread(obj1);
        th.start();
        Thread th1 = new Thread(obj1);
        th1.start();

    }
}