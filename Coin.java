package PP_5_6;

//LISTING 4.2
//********************************************************************
//  Coin.java       Author: Lewis/Loftus/Cocking
//
//  Represents a coin with two sides that can be flipped.
//********************************************************************
public class Coin implements Lockable
{
   private final int HEADS = 0;
   private final int TAILS = 1;
   private int face;
   private int key;
   private boolean lock=false;
   //-----------------------------------------------------------------
   //  Sets up the coin by flipping it initially.
   //-----------------------------------------------------------------
   public Coin ()
   {
      flip();
   }
   //-----------------------------------------------------------------
   //  Flips the coin by randomly choosing a face value.
   //-----------------------------------------------------------------
   public void flip ()
   {
       if(lock==false){
      face = (int) (Math.random() * 2);}
   }
   //-----------------------------------------------------------------
   //  Returns true if the current face of the coin is heads.
   //-----------------------------------------------------------------
   public boolean isHeads ()
   {
       if(lock==false){
           return (face == HEADS);}
       //throw return 1;
       return false;
   }
   //-----------------------------------------------------------------
   //  Returns the current face of the coin as a string.
   //-----------------------------------------------------------------
   public String toString()
   {
       if(lock==false){
      String faceName;
      if (face == HEADS)
         faceName = "Heads";
      else
         faceName = "Tails";
      return faceName;}
      return "please unlock";
   }
   public void setKey(int n){
       key=n;
       lock = false;
    }
   public void lock(int n){
       if(n==key){
           lock = true;
        }
    }
   public void unlock(int n){
       if(n==key){
           lock = false;
        }
    }
   public boolean locked(){
       return lock;
    }
}

