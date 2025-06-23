// Example showing the concept of Thread

class Demo1{
    public static void main(String args[]){
        System.out.println("Current Thread : "+Thread.currentThread());
        System.out.println("Current Thread : "+Thread.currentThread().getName());
        System.out.println("Current Thread : "+Thread.currentThread().getPriority());
    }
}