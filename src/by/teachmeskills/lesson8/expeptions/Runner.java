package by.teachmeskills.lesson8.expeptions;

/**
 * @author Dzmitry Fursevich
 */
public class Runner {
    public static void main(String[] args) throws Exception {
        try {
            int result = divide();
            System.out.println(result);
        } catch (ArithmeticException ar) {
            System.out.println(ar.getMessage());
        } catch (NullPointerException np) {
            System.out.println(np.getMessage());
        }
        System.out.println("After try catch");

//        try {
//            int result = divide();
//            System.out.println(result);
//        } finally {
//            System.out.println("Block finally");
//        }
//
//        System.out.println("After try finally");
        System.out.println("-------------------");
        try {
            int result = divide();
            System.out.println(result);
        } catch (Exception ar) {
//            System.out.println(ar.getMessage());
        } finally {
            System.out.println("Block finally");
        }

        System.out.println("After try catch finally");
        System.out.println("-------------");

        double result = divide(10, 0);


//        addToArray();

//        nullPointer();
//        System.out.println("After exception");
    }

    private static int divide() {
        return 10 / 0;
    }

    private static void addToArray() {
        int[] ar = new int[4];
        ar[4] = 10;
    }

    private static void nullPointer() {
        String s1 = null;
        s1.toUpperCase();
    }

    private static double divide(int a, int b) throws Exception {
        if (b == 0) {
            throw new Exception("Can't divide by 0");
        }
        return (double) a / b;
    }
}
