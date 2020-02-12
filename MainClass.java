/*import static BitwiseOperator.BitwiseOperator.*;
import static Recursion.Recursion.*;

import java.util.Scanner;

public class MainClass {
    public static void main(String args[]) {
        System.out.println("select the option to execute \n" +
                "1. Bitwise Operator \n" + "2. Bit Position \n" +
                "3. Bit count \n" + "4. COvnvert to gray code without recursion \n"
                + "5. Reverse the num using recursion \n"
        );

        Scanner scan = new Scanner(System.in);

        int i = scan.nextInt();
        switch (i) {
            case 1:
                int printBitPosition = BitPosition();
                break;
            case 2:
                int bitWiseOperation = BitOperation();
                break;
            case 3:
                int countNumOfOnes = CountNumOfOnes();
                break;
            case 4:
                int withoutRecusion = gray();
                break;
            case 5:
                 int withRecursion = reverseTheNumber();
            case 6:
                System.out.println("No meth for this option");
        }
    }

}*/
