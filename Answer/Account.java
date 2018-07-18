
package Bank;


public class Account {
    int check = -1;//to check successive transactions
     double balance;
     public Account(double balance){
         
     this.balance= balance;
     }
    public void Withdraw(double withdraw)//method for withdrawal
    {
        if(check==1)
        {
        balance -= (0.004*withdraw + withdraw);
        }
        else {
        
                balance -= (0.005*withdraw + withdraw);
        
        }
        check =0;
    System.out.println("Balance after withdrawal = "+balance);
    
    }
    
       public void Deposit(double deposit)//method for deposit
    {
        if(check==0)
        {
        balance+= (0.002*deposit + deposit);
        }
        else {
        
                balance -= (0.0025*deposit + deposit);
        
        }
        check =1;
    System.out.println("Balance after deposit = "+balance);
    
    }
       
}
