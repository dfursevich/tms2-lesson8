package by.teachmeskills.lesson8;

/**
 * @author Dzmitry Fursevich
 */
public class PolindromExample {
    public static void main(String[] args) {
        String polindrom = "aabbaa";

        boolean isPolindrom = true;
        for (int i = 0; i < polindrom.length() / 2; i++) {
            char a = polindrom.charAt(i);
            char b = polindrom.charAt(polindrom.length() - 1 - i);
            if (a != b) {
                isPolindrom = false;
                break;
            }
        }

        System.out.println("isPolindrom = " + isPolindrom);
    }
}
