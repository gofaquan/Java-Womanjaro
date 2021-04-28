public class MonkeyEatPeach {
    public static void main(String[] args) {
        //monkey's day1 sum's half + 1
        //monkey's day2 left's half + 1
        //monkey's day3 left's half + 1
        //.................
        //day10 left 1 peach        how many peach in total?

        peach peach = new peach();
        int peach1 = peach.peach(1);
        System.out.println(peach1);

    }
}

class peach{

    public int peach(int day){
        if (day == 10){
            System.out.println("left 1 peach");
            return 1;
        }else if (day <= 10){
            return (peach(day + 1) + 1) * 2;
        } else{
            System.out.println("day must in 10 days!");
            return -1;
        }
    }

}