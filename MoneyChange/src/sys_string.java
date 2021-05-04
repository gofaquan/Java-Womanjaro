import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.SimpleFormatter;

public class sys_string {
    public static void main(String[] args) {
        boolean logOut = true;
        String details = "================MoneyDetails================";
        double money = 0;
        double totalMoney = 0;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("\n================MoneyChangeMenu================");
            System.out.println("\t\t\tMoneyConsumedDetails");
            System.out.println("\t\t\tMoneyProfit");
            System.out.println("\t\t\tMoneyConsume");
            System.out.println("\t\t\tlog         out");

            System.out.println("================choose 1 - 4 to use this application^^================");
            String Key = scanner.next();

            switch (Key) {
                case "1":
                    System.out.println(details);
                    break;
                case "2":
                    System.out.println("2.MoneyProfit");
                    money = scanner.nextDouble();

                    if (money <=0){
                        System.out.println("get money <0!!!");
                        break;
                    }

                    totalMoney += money;
                    Date date = new Date();
                    details += "\nget money\t+" + money + "\t" + sdf.format(date) + "\t" + totalMoney;
                    break;
                case "3":
                    System.out.println("3.MoneyConsume,print your consume price!");
                    money = scanner.nextDouble();

                    if (money >=0){
                        System.out.println("consume money >0!!!");
                        break;
                    }

                    if (totalMoney < -money){
                        System.out.println("money is lacked!!!");
                        break;
                    }
                    totalMoney -= money;
                    System.out.println("print your explanation");
                    String note = scanner.next();
                    date = new Date();
                    details += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t" + totalMoney;
                    break;
                case "4":
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
                    break;

                default:
                    System.out.println("plz print 1-4 if u wanna use this,thanks");
            }

            System.out.println("----------------------------------------------------------------");
        } while (logOut);
    }

}
