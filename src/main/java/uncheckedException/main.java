package uncheckedException;

public class main {
    public static int divideByZero(int x, int y) throws ArithmeticException {

        try {
            return x / y;
        } catch (ArithmeticException ex) {
            System.out.println("cannot divide by Zero");
        }
        return 0;
    }
    public static void main(String[] args) {
     divideByZero(10,0);
    }
}
