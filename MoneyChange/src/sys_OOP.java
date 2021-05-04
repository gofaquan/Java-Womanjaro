import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class sys_OOP {
    boolean logOut = true;
    String details = "================MoneyDetails================";
    double money = 0;
    double totalMoney = 0;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
    Scanner scanner = new Scanner(System.in);


    public void mainMenu() {
        do {
            System.out.println("\n================OOPChooseMoneyChangeMenu================");
            System.out.println("\t\t\tMoneyConsumedDetails");
            System.out.println("\t\t\tMoneyProfit");
            System.out.println("\t\t\tMoneyConsume");
            System.out.println("\t\t\tlog         out");

            System.out.println("================choose 1 - 4 to use this application^^================");
            String Key = scanner.next();

            switch (Key) {
                case "1" -> this.details();
                case "2" -> this.moneyProfit();
                case "3" -> this.consume();
                case "4" -> this.logOut();
                default -> System.out.println("plz print 1-4 if u wanna use this,thanks");
            }
        }while (logOut);
    }

    public void details(){
        System.out.println(details);
    }

    public void moneyProfit(){
        System.out.println("2.MoneyProfit");
        money = scanner.nextDouble();

        if (money <=0){
            System.out.println("get money <0!!!");
            return;
        }

        totalMoney += money;
        Date date = new Date();
        details += "\nget money\t+" + money + "\t" + sdf.format(date) + "\t" + totalMoney;
    }

    public void consume(){
        System.out.println("3.MoneyConsume,print your consume price!");
        money = scanner.nextDouble();

        if (money <=0){
            System.out.println("consume money <0!!!");
            return;
        }

        if (totalMoney < money){
            System.out.println("money is lacked!!!");
            return;
        }
        totalMoney -= money;
        System.out.println("print your explanation");
        String note = scanner.next();
        Date date = new Date();
        details += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t" + totalMoney;
    }


    public void logOut(){
        System.out.println("4.log    out");
        String choice;
        while (true) {
            System.out.println("ready to exit?");
            choice = scanner.next();
            if (choice.equals("y")) {
                logOut = false;
                break;
            }else if (choice.equals("n")){
                break;
            }
        }

    }

}


class show {
    public static void main(String[] args) {
        new sys_OOP().mainMenu();
    }
}