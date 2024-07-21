package Ejercicio3;

import javax.swing.*;

public class Loan {
    public int codeLoan;
    public String dateLoan;
    public String nameBook;
    public int userCode;
    public int daysLoan;
    public String statusLoan = "Avalible";

    public void CheckLoanStatus(){
        JOptionPane.showMessageDialog(null,"your status is "+ statusLoan);
    }

    public void CheckLoanDetails(){
        JOptionPane.showMessageDialog(null,"Book name: " + nameBook + "\nDays loan: " + daysLoan + "\nDate loan: " + dateLoan + "\nCode loan: " + codeLoan + "\nUser code: " + userCode);
    }
}


