public class ObCd1 {
    public static void main(String[] args) {

        Double d1 = Double.valueOf(4.2);

        String str1 = "5.2";
        double d2 = Double.parseDouble(str1);

        byte b1 = d1.byteValue();
        double d3 = d1.doubleValue();
        float f1 = d1.floatValue();
        int i1 = d1.intValue();
        long l1 = d1.longValue();
        short s1 = d1.shortValue();

        System.out.println(d1);
        System.out.println("parseDouble: " + d2);
        System.out.println("byte: " + b1 + ", double: " + d3 + ", float: " + f1);
        System.out.println("int: " + i1 + ", long: " + l1 + ", short: " + s1);

        String d = Double.toString(3.14);
        System.out.println("Строка: " + d);

    }
}