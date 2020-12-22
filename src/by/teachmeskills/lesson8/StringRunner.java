package by.teachmeskills.lesson8;

import java.util.Arrays;

/**
 * @author Dzmitry Fursevich
 */
public class StringRunner {
    public static void main(String[] args) {
        String s1 = new String("hello");
        String s2 = "hello";
        String s3 = new String(new char[] {'h', 'e', 'l', 'l', 'o'});

        System.out.println("s3.length() = " + s3.length());

        for(int i = 0; i < s3.length(); i++) {
            System.out.print(s3.charAt(i));
        }
        System.out.println();

        String s4 = "";
        String s5 = null;
        if (s4 != null && s4.isEmpty()) {
            System.out.println("Stirng is empty");
        }

        String s6 = "    ";
        if (s6.isBlank()) {
            System.out.println("String is blank");
        }

        String s7 = "hello world";
        System.out.println("s7.indexOf('l') = " + s7.indexOf('l'));
        System.out.println("s7.lastIndexOf('l') = " + s7.lastIndexOf('l'));

        System.out.println("s7.replace('l', 'L') = " + s7.replace('l', 'L'));
        System.out.println("s7  = " + s7);

        System.out.println("s7.replace('world', 'peace') = " + s7.replace("world", "peace"));
        System.out.println("s7.toUpperCase() = " + s7.toUpperCase());
        System.out.println("s7.substring() = " + s7.substring(3, 9));
        System.out.println("s7 = " + s7.endsWith("ld"));

        String s8 = String.join("\n", "Hello", "World", "Again");
        System.out.println("s8 = " + s8);

        String v9 = String.valueOf(999);
        System.out.println("v9 = " + v9);

        String s10 = new String("hello");
        String s11 = new String("hello");

        System.out.println("s11 == s10: " + (s11 == s10));
        System.out.println("s10.equals(s11) = " + s10.equals(s11));
        
        String s12 = "Hello world. again";
        String[] split = s12.split(" ");
        System.out.println("Arrays.toString(split) = " + Arrays.toString(split));
    }
}
