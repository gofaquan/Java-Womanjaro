public class String_to_Basic {
    public static void main(String[] args) {
        String s = "123";
        //String is converted to different types!
        int num1 = Integer.parseInt(s);
        double num2 = Double.parseDouble(s);
        float num3 =  Float.parseFloat(s);
        long num4 = Long.parseLong(s);
        byte num5 = Byte.parseByte(s);
        boolean num6 = Boolean.parseBoolean("true");
        short num7 = Short.parseShort(s);

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);
        System.out.println(num7);
        System.out.println(s.charAt(0));    //print the one that index is 0
    }
}
