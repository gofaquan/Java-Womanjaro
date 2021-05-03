package encapsulation;

public class encapsulation_easy_try {
    public static void main(String[] args) {
        Account qwm = new Account("22222", "123456", 9);

        System.out.println(qwm.getName());
        System.out.println(qwm.getMoney());
        System.out.println(qwm.getPassword());
    }
}


class Account {
  private   String name;
  private   String password;
  private   double money;

    public Account(String name, String password, double money) {
        setName(name);
        setPassword(password);
        setMoney(money);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length()<=4 && name.length()>=2){
            this.name = name;
        }else {
            System.out.println("you're fake name!");
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(password.length()==6){
            this.password = password;
        } else {
            System.out.println("the password must be 6 chars");
        }
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}