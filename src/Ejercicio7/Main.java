package Ejercicio7;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Complaint comp = new Complaint();

        comp.numComplaint = 12;
        comp.setStatusComplaint("Denegate");
        comp.setNamePerson(JOptionPane.showInputDialog(null, "Name: "));
        comp.setAffair(JOptionPane.showInputDialog(null, "Affair: "));
        comp.descriptionComplaint = JOptionPane.showInputDialog(null, "Description: ");


        System.out.println(comp.getStatusComplaint());
        comp.messageReceptionComplaint();
    }
}
