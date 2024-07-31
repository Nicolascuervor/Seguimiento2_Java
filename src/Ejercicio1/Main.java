package Ejercicio1;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String parametro1 = JOptionPane.showInputDialog("Enter user: ");
        String parametro2 = JOptionPane.showInputDialog("Enter password: ");

        User user = new User(parametro1,parametro2,"basic123","124","System status: Avalible");


        System.out.println(user.accessValidation());
        System.out.println(user.checkStatus());


    }
}
