public class BankAccount {
    private String name;
    private String email;
    private String phonenumber;
    private long balance;
    
    BankAccount(String name,String email,String phonenumber){
        this.name=name;
        this.email=email;
        this.phonenumber=phonenumber;
    }
    
    public void addbalance(long Balance){
        if(balance>0){
        balance+=Balance;
        }
        else{
        System.out.println("Sorry you entered wrong Number or negative Number");
        }
    }
    
    public void removebalance(long money){
    if(money>=0){
    balance-=money;
    }
        else{
        System.out.println("Sorry you entered wrong number");
         
        }
    
    }
    
}
