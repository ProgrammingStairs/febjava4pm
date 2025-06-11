// Program showing the concept of hashCode() method

class Product{
    int pid;
    String pname;
    double price;

    Product(int pid,String pname,double price){
        this.pid=pid;
        this.pname=pname;
        this.price=price;
    }
    @Override
    public int hashCode(){
        return pid;
    }
}
class Demo2{
    public static void main(String args[]){
        Product obj1 = new Product(123,"Soap",123.456);
        Product obj2 = new Product(124,"Fairness Cream",567.77);
       
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
    }
}
