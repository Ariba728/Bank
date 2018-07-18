
package Bank;

import java.util.*;
public class BankAccount {
    
    static double totalbalance, withdrawamount, depositamount; 
    
    public static void main (String [] args)
    {
        char c1;//to check condition to continue or not
        Account a= new Account(100);//passing account balance
        Scanner sc= new Scanner(System.in);
        

       do
        {
           System.out.println("1. withdrawl");
           System.out.println("2. deposit");
           System.out.println("enter your choice");
           int ch=sc.nextInt();//variable for switch cases
    switch(ch)
    {
        case 1: System.out.println("enter withdrwal amount");
                 withdrawamount=sc.nextDouble();
                 a.Withdraw(withdrawamount);//method call for withdrawal in bankaccount
                
                break;
        case 2 :System.out.println("enter deposit amount"); 
                depositamount=sc.nextInt();
               a.Deposit( depositamount);//method call for deposit in bankaccount
                break;
        
    }
    System.out.println("do you want to continue - y/n");
     c1=sc.next().charAt(0);
            }
    while(c1!='n');
        
        
    
        
         }
    
}
