package uncheckedException;

public class ExceptDemo {

    public static int divideByZero(int x, int y)throws ArithmeticException {
        return x / y;
    }
        public static void main(String[] args) {
            System.out.println(divideByZero(10,2));

        int[] arr = {1,2,3,4,5};
        //Exception any exceptional thing that happens. it is also an object.
        //throws--> warning that you would be throwing
        //--> actaully throwing the excpetion.
        //runtime/unchecked exception--> it is our fault that the problem is happening. we can write a better code.
        //checked exceptions-->
    }
}
