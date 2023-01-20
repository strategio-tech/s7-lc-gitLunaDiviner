package tech.strategio;

import java.util.Scanner;

public class LoanCalculator {

    /**
     * TODO: finish out this JavaDoc comment block.
     * FIXME: WHAT DOES THIS METHOD DO?
     *
     * This method recieves a loan amount in the form of an int and then calculates the remaining after
     * amount after 3 months and returns the final amount after 3 months
     *
     * @param ??? Parameter is the loan taken from the friend
     * @return ??? Return will return the remaining loan amount from each month
     */


    static int getRemainingAmountIn3Months(int amount) {
        // TODO: Rewrite this method
        for (int i=0; i<3; i++){
            amount -= amount*0.10;
        }//end for loop

        //testing blah blah blah

        return amount;

    }//end method

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int amount = scanner.nextInt();
            System.out.println(getRemainingAmountIn3Months(amount));
        }
    }
}
