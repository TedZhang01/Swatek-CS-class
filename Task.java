package PP_5_5;

public class Task implements Priority,Complexity,Comparable{
    private int p,c;
    private String name;
    public Task (String n,int p1,int c2){
        p = p1;c=c2;
        name = n;
    }
    public int getPriority(){
        return p;
        
    }
    public void  setPriority(int p2)
    {
     p=p2;
    }
    public void setComplexity(int c1){
        c = c1;
    }
    public int getComplexity(){
         return c;   
    }
    public int compareTo(Object obj){
        int p1 = this.getPriority();
        int p2 = ((Task)obj).getPriority();
        if(p1>p2){
            return 1;
        }else if(p1<p2){
            return -1;
        }else {
        return 0;}
    }
    public String toString(){
        return name;
    }
}