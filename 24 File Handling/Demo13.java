// example showing the concept of File Handling in java
import java.io.*;
class Demo13{
    public static void main(String args[]){
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try{
            System.out.println("Enter name : ");
            String name = br.readLine();

            System.out.println("Enter age : ");
            String age = br.readLine();
            
            System.out.println("Name : "+name); 
            System.out.println("Age : "+age); 
        }catch(IOException e){
            System.out.println("Exception : "+e);
        }
    }
}
