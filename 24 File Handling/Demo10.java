// example showing the concept of File Handling in java
import java.io.*;
class Product implements Serializable{
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
class Demo10{
    public static void main(String args[]){
        Product pobj = new Product(12345,"Fairness Cream",10000);
        File file = new File("D:\\desktop\\CodingThinker\\febjava4pm\\24 File Handling\\myFolder\\newFile.txt");
        try(FileOutputStream fout = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fout);){ 
            oos.writeObject(pobj);
            System.out.println("Data inserted successfully");
        }catch(IOException e){
            System.out.println("Exception : "+e);
        }

        try(FileInputStream fin = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fin);){ 
            Product obj = (Product)ois.readObject();
            System.out.println("data : "+obj);
        }catch(IOException | ClassNotFoundException e){
            System.out.println("Exception : "+e);
        }
    }
}
