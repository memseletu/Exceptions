package checkedException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void checkInput(int input){
        if(input<0){
            System.out.println("you entered" + input);
            throw new ArithmeticException("must enter a number greater than zero");
        }
    }
    public static void numbers(){
        File file = new File("/Users/memseletumoundae/Desktop/projects/exceptionsClassLectureoct18/src/main/resources/numbers.txt");
        Scanner scanner = null;
        try(Scanner scanner1 = new Scanner(file)){

            while(scanner.hasNext()){
                double number = scanner.nextDouble();
                System.out.println(number);
            }
        }catch(FileNotFoundException ex){
            ex.printStackTrace();
//        }finally{
//            scanner.close();
        }
    }

    public static void main(String[] args) {
 numbers();
 checkInput(2);
    }
}
