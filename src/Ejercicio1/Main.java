package Ejercicio1;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.inputUser = JOptionPane.showInputDialog("Enter user: ");
        user.inputPass = JOptionPane.showInputDialog("Enter password: ");

        System.out.println(user.accessValidation());
        System.out.println(user.checkStatus());


    }
}