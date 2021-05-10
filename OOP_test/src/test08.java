import java.util.Timer;

public class test08 {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(500, 0.0001, 1);

        savingsAccount.deposit(999);
        savingsAccount.deposit(999);
        savingsAccount.withdraw(999);
        savingsAccount.withdraw(999);
        System.out.println(savingsAccount.getMoney());

    }
}



class SavingsAccount {
    private  double money;
    private  double profit;
    private  double fee;
    private  int count;

    public void earnMonthlyInterest(){
        count = 3;
        money = money*(1+profit);
    }

    public SavingsAccount(double money, double profit, double fee) {
        this.money = money;
        this.profit = profit;
        this.fee = fee;
    }

    public void deposit(double amount){
        money += amount;
        count++;
        if (count > 3) {
           money -= fee;
        }

    }

    public void withdraw(double amount){
        if (money < amount+fee){
            System.out.println("your money isn't enough! ");
            return;
        }
        count ++;

        if (count >3) {money -=  amount+fee;}else {money -=  amount;}
    }

    public double getMoney() {
        return money;
    }

    public double getProfit() {
        return profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }



}
