public class HouseView {

    private boolean loop = true;
    private String key = "";

    public void mainMenu() {

        do {
            System.out.println("=========================房屋出租系统菜单=========================");
            System.out.println("\t\t\t1.新 增 房 屋");
            System.out.println("\t\t\t2.查 找 房 屋");
            System.out.println("\t\t\t3.删 除 房 屋");
            System.out.println("\t\t\t4.房 屋 列   表");
            System.out.println("\t\t\t5.退 出");
            System.out.println("输入你的选择1-6");

            switch (key) {
                case "1":
                    System.out.println("新增");
                    break;

                case "2":
                    System.out.println("查找");
                    break;

                case "3":
                    System.out.println("删除");
                    break;

                case "4":
                    System.out.println("房屋列表");
                    break;

                case "5":
                    System.out.println("退出");
                    loop = false;
                    break;

            }

        } while (loop);

    }
}
