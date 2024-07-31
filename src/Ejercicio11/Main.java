package Ejercicio11;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int parameterNum = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter some number"));

        Ed eorodd = new Ed(parameterNum);


        System.out.println(eorodd.determine());
    }
}
