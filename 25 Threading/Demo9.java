// Example showing the concept of Thread

class Demo9 extends Thread{
    public void run(){
        for(int i=1;i<=10;i++){
              System.out.println("i : "+i);
        }
    }
    public static void main(String args[]){
        Demo9 obj1 = new Demo9();
        Demo9 obj2 = new Demo9();
        obj1.start();
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            System.out.println("Exception : "+e);
        }
        obj2.start();
    }
}