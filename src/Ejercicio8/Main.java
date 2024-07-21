package Ejercicio8;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Payday pay = new Payday();

        pay.setNameEmploye(JOptionPane.showInputDialog(null,"Enter your Name: "));
        pay.hoursWork = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your hours worked: "));
        pay.message();
    }
}
