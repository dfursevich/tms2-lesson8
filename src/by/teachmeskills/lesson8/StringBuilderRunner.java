package by.teachmeskills.lesson8;

/**
 * @author Dzmitry Fursevich
 */
public class StringBuilderRunner {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "world";
        String s3 = s1.concat(s2);
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);

        String s4 = "The car speed is " + 30 + "km/h and fuel consumption is " + 10 + "l/h";
        String s5 = (("The car speed is ".concat(String.valueOf(30))).concat("km/h and fuel consumption is ")).concat(String.valueOf(10));

        StringBuilder sb = new StringBuilder();
        sb.append("The car speed is ")
                .append(30)
                .append(" km/h and fuel consumption is ")
                .append(10)
                .append(" l/h");
        System.out.println("sb.toString() = " + sb.toString());

        //wrong
        String concatStr = "";
        for (int i = 0; i < 10; i++) {
            concatStr += i;
        }
        System.out.println("concatStr = " + concatStr);

        //wrong
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            sb2.append(i);
        }
        System.out.println("sb2 = " + sb2);
    }
}
