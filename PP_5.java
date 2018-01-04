import java.util.Scanner;

public class PP_5
{
    // instance variables - replace the example below with your own
    public static void main(String[]args)
    {
        double n1=0,n2=0,n3=0;
        int a=0,b=0,c=0;
        char j;
        boolean s=true;
        Scanner haha = new Scanner(System.in);
        
        
        String x = new String("011");
        a = x.length();
        x= x.concat("123");
        n2=2.1;
        n1=2.0;
        n3 = n2%n1;
        
        
        /*for(int l = a -1;l>=0;l--){
            if(x.charAt(l)=='1'){
                c+=Math.pow(2,b);
            }
            b++;
        }*/
       System.out.println(""+n3+n2);
    }
}