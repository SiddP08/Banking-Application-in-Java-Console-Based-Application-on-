import java.util.*;

public class BankingApp {

    public static void main(String[] args) {
       BankAccount ob =new BankAccount("Sidd","2345");
       ob.showMenu();
    }
}


class BankAccount{
    int balance;
    int previousTransaction;
    String customerName;
    String customerId;
    
    
    BankAccount(String cname,String cid){
        customerName=cname;
        customerId=cid;
    }
    
    void deposit(int amount){
        if(amount !=0){
            balance =balance+amount;
            previousTransaction =amount;
            
        }
    }
    void withdraw(int amount){
         if(amount !=0){
            balance =balance-amount;
            previousTransaction =-amount;
            
        }
    }
    void getPreviousTransaction(){
    if(previousTransaction >0){
        System.out.println("Deposited :"+previousTransaction);
    }
    else if(previousTransaction <0){
        System.out.println("Withdraw: "+Math.abs( previousTransaction));
    }
    else{
        System.out.println("No transaction Occured");
    } 
}
       void showMenu(){
        char option='\0';
        Scanner sc =new Scanner(System.in);
        System.out.println("Welcome ...."+customerName);
        System.out.println("your Id "+customerId);
        System.out.println("------------------------------------------------------------ ");
        
        
        System.out.println("A: Cherck Your Balance");
        System.out.println("B: Deposit");
        System.out.println("C: Withdraw");
        System.out.println("D: Previous Transaction");
        System.out.println("E: Exit the system");
        
        do{
            System.out.println("--------------------********--------------------");
            System.out.println("Enter a option");
            System.out.println("--------------------********--------------------");
            option=sc.next().charAt(0);
            switch(option){
                case 'A':
                System.out.println("--------------------------------------------------");
                 System.out.println("Balance ="+balance);
                System.out.println("--------------------------------------------------");
                System.out.println("\n");
                break;
                
                case 'B':
                System.out.println("--------------------------------------------------");
                 System.out.println("Enter an amount  to Deposit: ");
                System.out.println("--------------------------------------------------");
                int amount=sc.nextInt();
                deposit(amount);
                System.out.println("\n");
                break;
                
                case 'C':
                System.out.println("--------------------------------------------------");
                 System.out.println("Enter an amount  to Withdraw: ");
                System.out.println("--------------------------------------------------");
                int amount2=sc.nextInt();
               withdraw(amount2);
                System.out.println("\n");
                break;
                
                 case 'D':
                System.out.println("--------------------------------------------------");
                 getPreviousTransaction();
                System.out.println("--------------------------------------------------");
                System.out.println("\n");
                break;
                
                 case 'E':
                     System.out.println("---------*******---------------********-----------********---------");
                     break;
                     
                 default:
                     System.out.println("Invalid option!! Please Enter correct option..");
                     break;
            }
        }while(option != 'E');
                System.out.println("Thank You for Using our Services......!!");
    } 

}