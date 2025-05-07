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
class Demo2{
    public static void main(String args[]){
        Product pobj[] = new Product[2]; // reference array
        System.out.println("pobj[0] : "+pobj[0]);
        System.out.println("pobj[1] : "+pobj[1]);

        pobj[0] = new Product(121,"Soap",45.54);
        pobj[1] = new Product(131,"Fairness Cream",435.84);
        
        //Product pobj[] = new Product[2]; // now this is considered as array of object
        System.out.println("pobj[0] : "+pobj[0]);
        System.out.println("pobj[1] : "+pobj[1]);

            pobj[0].display();
            pobj[1].display();
    }
}