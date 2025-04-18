// program to print perfect numbers between two entered numbers 

import java.util.Scanner;
class Demo6{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter initial and final numbers : ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int num=n;num<=m;num++){
            int sum=0;
            for(int i=1;i<=num/2;i++){
                if(num%i==0)
                    sum+=i;
            }
            if(sum==num)
                System.out.print(num+"\t");
        }
    }
}