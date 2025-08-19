public class savingsAccount {
    public double balance;
    public double interestRate = 0.01;
    public String name;

    public void cetak(){
        System.out.println("Customer: "+ name);
        System.out.println("balance: "+ balance);
        System.out.println("Interest Rate: "+interestRate);
        System.out.println("Interest earn: "+ (balance*interestRate));
        System.out.println();
    }
}
