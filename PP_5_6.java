package PP_5_6;

import java.util.Scanner;

public class PP_5_6
{
    // instance variables - replace the example below with your own
    public static void main(String[]args)
    {
        double n1=0,n2=0,n3=0;
        int a=0,b=0,c=0;
        char j;
        boolean s=true;
        Scanner haha = new Scanner(System.in);
        
        
        Coin hehe = new Coin();
        System.out.println("please set key");
        b = haha.nextInt();
        hehe.setKey(b);
        hehe.lock(b);
        System.out.println("enter the key to unlock");
        c = haha.nextInt();
        hehe.unlock(c);
        hehe.flip();
        
       System.out.println(""+hehe);
    }
}