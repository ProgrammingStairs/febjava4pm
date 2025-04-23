// program showing the concept of shallow copy

class Address{
    String city,state;
    Address(String city,String state){
        this.city = city;
        this.state = state;
    }
}
class Student{
    int sid;
    String name;
    Address address;
    Student(int sid,String name,Address address){
        this.sid=sid;
        this.name=name;
        this.address=address;
    }
    Student(Student s1){
       sid = s1.sid;
       name = s1.name;
       address =  s1.address;
    }
    void display(){
        System.out.println("Sid : "+sid);
        System.out.println("Name : "+name);
        System.out.println("Address : \n\tCity : "+address.city+"\n\tState : "+address.state);
    }
} 
class Demo11{
    public static void main(String args[]){
        Address address = new Address("Indore","Madhya Pradesh");
        Student s1 = new Student(111,"Andrew Anderson",address);
        Student s2 = new Student(s1);

        s2.address.state = "Gujrat";
        s2.address.city = "Gandhi Nagar";

        s1.display();
        System.out.println("\nAfter Copying : \n");
        s2.display();
    }
}