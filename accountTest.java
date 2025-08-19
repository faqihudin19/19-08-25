public class accountTest {
    public static void main(String[] args) {

        savingsAccount sa0001 = new savingsAccount();
        sa0001.balance =1000;
        sa0001.name = "Damien";
        sa0001.interestRate = 0.02;
        sa0001.cetak();
        savingsAccount sa0002 = new savingsAccount();
        sa0002.balance = 2000;
        sa0002.name = "bill";
        sa0002.interestRate = 0.02;
        sa0002.cetak();


    }
}
