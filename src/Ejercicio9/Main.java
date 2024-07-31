package Ejercicio9;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int parameterNum = (Integer.parseInt(JOptionPane.showInputDialog(null,"Enter some number: ")));

        NegativeOrPositive num = new NegativeOrPositive(parameterNum);


        System.out.println(num.determine());
    }
}
