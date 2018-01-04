package PP_5_7;

//LISTING 4.5
//********************************************************************
//  Account.java       Author: Lewis/Loftus/Cocking
//
//  Represents a bank account with basic services such as deposit
//  and withdraw.
//********************************************************************
import java.text.NumberFormat;
public class Account implements Lockable
{
   private NumberFormat fmt = NumberFormat.getCurrencyInstance();
   private final double RATE = 0.035;  // interest rate of 3.5%
   private int acctNumber;
   private double balance;
   private String name;
   private int key;
   private boolean lock=false,go=true;
//-----------------------------------------------------------------
   //  Sets up the account by defining its owner, account number,
   //  and initial balance.
   //-----------------------------------------------------------------
   public Account (String owner, int account, double initial)
   {
      name = owner;
      acctNumber = account;
      balance = initial;
   }
   public Account (String owner, int account){
      
      name = owner;
      acctNumber = account;
      balance = 0.0;
       
    }
   //-----------------------------------------------------------------
   //  Validates the transaction, then deposits the specified amount
   //  into the account. Returns the new balance.
   //-----------------------------------------------------------------
   public double deposit (double amount)
   {
       if(go){
      if (amount < 0)  // deposit value is negative
      {
         System.out.println ();
         System.out.println ("Error: Deposit amount is invalid.");
         System.out.println (acctNumber + " " + fmt.format(amount));
      }
      else
         balance = balance + amount;
      
      return balance;}else{return 0;}
   }
   //-----------------------------------------------------------------
   //  Validates the transaction, then withdraws the specified amount
   //  from the account. Returns the new balance.
   //-----------------------------------------------------------------
   public double withdraw (double amount, double fee)
   {
       if(go){
      amount += fee;
      if (amount < 0)  // withdraw value is negative
      {
         System.out.println ();
         System.out.println ("Error: Withdraw amount is invalid.");
         System.out.println ("Account: " + acctNumber);
         System.out.println ("Requested: " + fmt.format(amount));
      }
      else
         if (amount > balance)  // withdraw value exceeds balance
         {
            System.out.println ();
            System.out.println ("Error: Insufficient funds.");
            System.out.println ("Account: " + acctNumber);
            System.out.println ("Requested: " + fmt.format(amount));
            System.out.println ("Available: " + fmt.format(balance));
         }
         else
            balance = balance - amount;
      return balance;}else{return 0;}
   }
   //-----------------------------------------------------------------
   //  Adds interest to the account and returns the new balance.
   //-----------------------------------------------------------------
   public double addInterest ()
   {
       if(go){
      balance += (balance * RATE);
      return balance;}
      return 0;
   }
   //-----------------------------------------------------------------
   //  Returns the current balance of the account.
   //-----------------------------------------------------------------
   public double getBalance ()
   {
       if(go){
      return balance;
    }return 0;
   }
   //-----------------------------------------------------------------
   //  Returns the account number.
   //-----------------------------------------------------------------
   public int getAccountNumber ()
   {if(go){
      return acctNumber;}
      return 0;
   }
   public void Transfer(Account other, int amount,int fee){
       if(go){
       this.withdraw(amount,fee);
       other.deposit(amount);
    }
    }
 
   //-----------------------------------------------------------------
   //  Returns a one-line description of the account as a string.
   //-----------------------------------------------------------------
   public String toString ()
   {if(go){
      return (acctNumber + "\t" + name + "\t" + fmt.format(balance));}
      return "u need unlock";
   }
      public void setKey(int n){
          
       key=n;
       lock = false;
    }
   public void lock(int n){
       if(n==key){
           lock = true;
           go = !lock;
        }
    }
   public void unlock(int n){
       if(n==key){
           lock = false;
           go = !lock;
        }
    }
   public boolean locked(){
       return lock;
    }
}

