//  example showing the concept of pojo class

class Demo1{
    int rno;
    protected String name;
    public double per;

    private void setRno(int rno){
        this.rno = rno;
    }
    public void setNamePer(String name,double per){
        this.name = name;
        this.per = per;
    }
    protected void printData(){
        System.out.println("Roll Number : "+rno);
        System.out.println("Percentage : "+per);
        System.out.println("Name : "+name);
    }
    public static void main(String args[]){
        Demo1 obj = new Demo1();
        obj.setRno(1000);
        obj.setNamePer("Andrew Anderson",89.87);
        obj.printData();
    }
}