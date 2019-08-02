/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RPL
 */
import java.util.*;
class Ch3LoanCalculatorstep1 {
    public static void main (String[] args) {
        double loanAmount,
                annualInterestRate;
        int loanPeriod = 0;
    Scanner scanner = new Scanner (System.in);
    scanner.useDelimiter(System.getProperty("line.separator"));
    
    // mendapat nilai masukan
    System.out.print("Loan Amount (Dollars+cents): ");
    loanAmount  = scanner.nextDouble();
    
    System.out.print("Annual Interest Rate (e.g/.9,5: ");
    annualInterestRate = scanner.nextDouble();
    
    System.out.println("");
    System.out.println("Loan Amount:        $" + loanAmount);
    System.out.println("Annual Interest Rate:        " + annualInterestRate+"%");
    System.out.println("Loan Period (years):        " + loanPeriod);
    }
}
