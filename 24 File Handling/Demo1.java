// example showing the concept of File Handling in java

import java.io.File;
class Demo1{
    public static void main(String args[]){
        File file = new File("D:\\desktop\\CodingThinker\\febjava4pm\\24 File Handling\\myFolder");
        if(!file.exists()){
            file.mkdir();
            System.out.println("Folder created successfully");
        }else
            System.out.println("Folder already exist");
    }
}