// example showing the concept of Exception Handling

import java.util.Scanner;
class InsufficientBalanceException extends Exception{
    InsufficientBalanceException(String msg){
        super(msg);
    }
}
class WithDraw{
    int bal;
    WithDraw(int bal){
        this.bal=bal;
    }
    void withDraw() throws InsufficientBalanceException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter withdrawal amount : ");
        int wamt = sc.nextInt();
            if(wamt>bal)
                throw new InsufficientBalanceException("Low Balance");
            System.out.println("Balance : "+bal);
            System.out.println("Withdraw amount : "+wamt);
            System.out.println("Remaining Balance : "+(bal-wamt));
    }
}
class Demo12{
    public static void main(String args[]){
        WithDraw obj = new WithDraw(1000);
        try{
            obj.withDraw();
        }catch(InsufficientBalanceException e){
            System.out.println("Exception : "+e);
        }
    }
}