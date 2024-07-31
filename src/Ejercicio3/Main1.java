package Ejercicio3;

import javax.swing.*;

public class Main1 {
    public static void main(String[] args) {

        int codeLoan = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the code loan:  "));
        String dateLoan = JOptionPane.showInputDialog(null,"Enter the date loan:  ");
        String nameBook = JOptionPane.showInputDialog(null,"Enter the name book:  ");
        int userCode = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your user code:  "));
        int daysLoan = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the days loan:  "));
        String statusLoan;

        Loan newloan = new Loan(codeLoan, dateLoan, nameBook, userCode, daysLoan, "avalible");



        newloan.CheckLoanDetails();
        newloan.CheckLoanStatus();




    }
}



