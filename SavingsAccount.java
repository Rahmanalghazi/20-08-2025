public class SavingsAccount {
    public double balance;
    public double interestRate = 0.01;
    public String name;

    public void displayCustomer(){
        System.out.println("customer : " + name);
        System.out.println("Balance : " + balance);
        System.out.println("Rate : " + interestRate);
        
    }
}
