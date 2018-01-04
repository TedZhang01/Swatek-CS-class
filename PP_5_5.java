package PP_5_5;

import java.util.Scanner;

public class PP_5_5
{
    // instance variables - replace the example below with your own
    public static void main(String[]args)
    {
        double n1=0,n2=0,n3=0;
        int a=0,b=0,c=0;
        char j;
        boolean s=true;
        Scanner haha = new Scanner(System.in);
        
        Task hw = new Task("hw",100,10000);
        Task gaming = new Task("gaming",1,0);
        hw.setPriority(10);
        hw.setComplexity(10);
        a = hw.compareTo(gaming);
        
        if(a>0){
           System.out.println(gaming+" "+hw);
        }else if(a<0){
                   System.out.println(hw+" "+gaming);
                }else{
                    System.out.println (hw+"&"+gaming+"are same");
                    
                }
       System.out.println(""+hw.getPriority()+" " +hw.getComplexity());
    }
}