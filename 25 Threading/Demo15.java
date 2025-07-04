// example showing the concept of static synchronization
class First{
    // creating shared resources here
    synchronized static void display(String name){
        System.out.print(" [ ");

        try{Thread.sleep(1000);}catch(InterruptedException e){System.out.println("Exception : "+e);}

        System.out.print(name);

        try{Thread.sleep(1000);}catch(InterruptedException e){System.out.println("Exception : "+e);}

        System.out.println(" ] ");
    }
}
class Second extends Thread{
    String name;
    Second(String name){
        this.name=name;
        start();
    }
    @Override
    public void run(){
        First.display(name);
    }
}
class Demo15{
    public static void main(String args[]){
        Second s1 = new Second("Andrew");
        Second s2 = new Second("Simon");
        Second s3 = new Second("Peter");
    }
}

