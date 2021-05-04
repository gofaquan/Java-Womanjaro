public class ObjectMethods {
    public static void main(String[] args) {
        //toString()
        Monster monster = new Monster("zhang_shang", "eat rice", 9999);
        System.out.println(monster.toString()+"----------------"+monster.hashCode());

        //finalize
        Car xiao_gou = new Car("xiao_gou");
        xiao_gou = null;
        System.gc();

        System.out.println("ok");

    }
}
