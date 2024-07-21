package Ejercicio3;

import javax.swing.*;

public class Main1 {
    public static void main(String[] args) {
        Loan newloan = new Loan();
        newloan.codeLoan = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the code loan:  "));
        newloan.dateLoan = JOptionPane.showInputDialog(null,"Enter the date loan:  ");
        newloan.nameBook = JOptionPane.showInputDialog(null,"Enter the name book:  ");
        newloan.userCode = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your user code:  "));
        newloan.daysLoan = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the days loan:  "));


        newloan.CheckLoanDetails();
        newloan.CheckLoanStatus();




    }
}



