package Exercise_16;

public class BankTest {
    public static void main(String[] args) {
        BankAccount[] list = new BankAccount[3];
        list [0] = new BankAccount("avi", 4000, 10);
        list [0].withdraw(100000);
        list [0].checkBalance();
        System.out.println(list[0]);
        list [1] = new BankAccount("Rotem", 20000, 12);
        list [2] = new BankAccount("Heba", 3000, 10);
        myBank(list);
    }
    public static void myBank(BankAccount[] blist)
    {
        BankAccount max = blist[0];
        for (int i =0; i<blist.length; i++)
        {
            blist[i].checkBalance();
            if (max.getCreditScore()<blist[i].getCreditScore())
            {
                max = blist[i];
            }
        }
        max.deposit(1000);
        System.out.println(max);
    }

}
