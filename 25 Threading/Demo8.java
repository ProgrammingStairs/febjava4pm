// Example showing the concept of Thread

class Demo8 extends Thread{
    public void run(){
        if(Thread.currentThread().isDaemon())
            System.out.println("Service provider thread");
        else
          System.out.println("User Thread");
    }
    public static void main(String args[]){
        Demo8 obj1 = new Demo8();
        Demo8 obj2 = new Demo8();
        Demo8 obj3 = new Demo8();
        obj1.setDaemon(true);
        obj1.start();
        obj2.start();
        obj3.start();
    }
}