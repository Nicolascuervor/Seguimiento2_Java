package Ejercicio3;

import javax.swing.*;

public class Loan {

    public int codeLoan;
    public String dateLoan;
    public String nameBook;
    public int userCode;
    public int daysLoan;
    public String statusLoan;



    public Loan(int codeLoan, String dateLoan, String nameBook, int userCode, int daysLoan, String statusLoan) {
        this.codeLoan = codeLoan;
        this.dateLoan = dateLoan;
        this.nameBook = nameBook;
        this.userCode = userCode;
        this.daysLoan = daysLoan;
        this.statusLoan = statusLoan;
    }

    public void CheckLoanStatus(){
        JOptionPane.showMessageDialog(null,"your status is "+ statusLoan);
    }

    public void CheckLoanDetails(){
        JOptionPane.showMessageDialog(null,"Book name: " + nameBook + "\nDays loan: " + daysLoan + "\nDate loan: " + dateLoan + "\nCode loan: " + codeLoan + "\nUser code: " + userCode);
    }
}


