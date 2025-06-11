// Program showing the concept of toString() method

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
    public String toString(){
        return pid+" "+pname+" "+price;
    }
}
class Demo1{
    public static void main(String args[]){
        Product obj = new Product(123,"Soap",123.456);
        System.out.println(obj);
        System.out.println(obj.toString());
    }
}

/*
    public String toString(){
        return getClass().getName()+"@"+Integer.toHexString(hashCode());
    }
*/