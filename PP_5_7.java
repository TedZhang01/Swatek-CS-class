package PP_5_7;

import java.util.Scanner;

public class PP_5_7
{
    // instance variables - replace the example below with your own
    public static void main(String[]args)
    {
        double n1=0,n2=0,n3=0;
        int a=0,b=0,c=0;
        char j;
        boolean s=true;
        Scanner haha = new Scanner(System.in);
        
        Account Ted = new Account("Ted",6666,0.5);
        System.out.println("set key");
        b = haha.nextInt();
        Ted.setKey(b);
        Ted.lock(b);
        do{
            System.out.println("input key to check account");
            b = haha.nextInt();
            Ted.unlock(b);
            if(Ted.locked()){
                   System.out.println("try again");
                  
                }
            }while(Ted.locked());
       System.out.println(""+Ted);
    }
}