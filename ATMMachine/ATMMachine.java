import java.util.Scanner;

public class Main {
   public static class  ATM{
        float Balance ;
        int PIN=5674;
       public void checkPIN(){
           System.out.println("Enter your Pin:");
           Scanner sc=new Scanner(System.in);
           int enteredPin=sc.nextInt();
           if(enteredPin==PIN){
               menu();
           }
           else {
               System.out.println("Enter a valid pin");
               menu();
           }
       }
       public  void menu(){
           System.out.println("Enter your choice :");
           System.out.println("1. Check A/C Balance : ");
           System.out.println("2. Withdraw Money ");
           System.out.println("3. Deposite Money ");
           System.out.println("4. Exit ");
         Scanner sc =new Scanner(System.in);
         int option=sc.nextInt();
         switch (option){
             case 1 :
                  checckBalance();
                  break;
             case 2:
                 withdrawMoney();
                 break;
             case 3:
                 depositeMoney();
                 break;
             case 4:
                  break;
             case 5 :
                 System.out.println("Enter a Valid choice");
                 break;
         }

       }
       public  void  checckBalance(){
           System.out.println("Balance :"+Balance);
           menu();
       }
       public  void withdrawMoney(){
           System.out.println("Enter Amount to Withdraw:");
           Scanner sc=new Scanner(System.in);
           float amount =sc.nextFloat();
           if(amount>Balance){
               System.out.println("Insufficient Balance ");
               menu();
           }
           else {
               Balance=Balance - amount;
               System.out.println("Money Withdrawn Successfully");
               menu();
           }
       }
       public void depositeMoney(){
           System.out.println("Enter the Amount : ");
           Scanner sc =new Scanner(System.in);
           float amount=sc.nextFloat();
           Balance =Balance+amount;
           System.out.println("Money Deposited Successfully");
           menu();

       }
    }

    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.checkPIN();

    }
}
