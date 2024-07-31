package Ejercicio8;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String parameterName = JOptionPane.showInputDialog(null,"Enter your Name: ");
        int parameterValue =Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your hours worked: "));

        Payday pay = new Payday(parameterName,parameterValue);

        pay.message();
    }
}
