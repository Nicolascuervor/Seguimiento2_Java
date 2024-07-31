package Ejercicio7;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String parameterName = JOptionPane.showInputDialog(null, "Name: ");
        String parameterAffair = JOptionPane.showInputDialog(null, "Affaire: ");
        String parameterDescriptionAffair = JOptionPane.showInputDialog(null, "Description: ");


        Complaint comp = new Complaint(12,parameterName,parameterAffair,parameterDescriptionAffair,"System status: Avalible");


        comp.messageReceptionComplaint();
        System.out.println(comp.getStatusComplaint());
    }
}
