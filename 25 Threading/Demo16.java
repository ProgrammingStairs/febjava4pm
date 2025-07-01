// example showing the concept of Inter Thread communication
class Customer{
    int bal;
    Customer(int bal){
        this.bal=bal;
    }
    synchronized void withdraw(int wamt){
        if(wamt>bal){
            System.out.println("Low Balance..!!!");
            try{
                wait();
            }catch(InterruptedException e){
                System.out.println("Exception : "+e);
            }
        }
        System.out.println("Balance : "+bal);
        System.out.println("Withdrawal Amount : "+wamt);
        this.bal = this.bal-wamt;
        System.out.println("Remaining Balance : "+this.bal);
    }
    synchronized void deposit(int damt){
        System.out.println("Going to deposit...");
        this.bal=this.bal+damt;
        System.out.println("Deposit Completed..!!!");
        System.out.println("Balance : "+bal);
        notify();
    }
}
class Demo16{
    public static void main(String args[]){
        Customer cobj = new Customer(1000);
        new Thread(){
            @Override
            public void run(){
                cobj.withdraw(800);
            }
        }.start();
        new Thread(){
            @Override
            public void run(){
                cobj.deposit(1000);
            }
        }.start();
    }
}

