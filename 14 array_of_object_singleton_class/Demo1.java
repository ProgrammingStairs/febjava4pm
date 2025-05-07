// Example
class Product{
    int pid;
    String name;
    double price;
    Product(int pid,String name,double price){
        this.pid=pid;
        this.name=name;
        this.price=price;
    }
    void display(){
            System.out.println(pid+" "+name+" "+price);
    }
}
class Demo1{
    public static void main(String args[]){
        Product pobj1 = new Product(121,"Soap",45.54);
        Product pobj2 = new Product(131,"Fairness Cream",435.84);
            pobj1.display();
            pobj2.display();
    }
}