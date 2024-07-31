package Ejercicio17;

import javax.swing.*;

public class Copyshop {
    public void menuCopys(){
        int decision1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Welcome to Copyshop \n Choose the copys you want to do \n 1. 0-499 copys (120 dollars per copy) \n 2. 500-749 copys (100 dollars per copy) \n 3. 750-999 copys (80 dollars per copy) \n 4. 1000 copys (50 dollars per copy)"));
        if(decision1 >=1 && decision1 <=499)JOptionPane.showMessageDialog(null,"The total amount to pay is: " + decision1*120 + " dollars");

        else if (decision1 >=500 && decision1 <=749) {
            JOptionPane.showMessageDialog(null,"The total amount to pay is: " + decision1*100 + " dollars");
        } else if (decision1 >=750 && decision1 <=999) {
            JOptionPane.showMessageDialog(null,"The total amount to pay is: " + decision1*80 + " dollars");
        } else if (decision1 > 1000) {
            JOptionPane.showMessageDialog(null,"The total amount to pay is: " + decision1*50 + " dollars");
        }

        else JOptionPane.showMessageDialog(null,"You haven'n choose any opcion");


    }
}
