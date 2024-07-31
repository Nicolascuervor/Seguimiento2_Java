package Ejercicio20;

import javax.swing.*;

public class Phones {
    private int movistar;
    private int tigo;
    private int claro;

    private int tigoInternational;
    private int tigoPackage;

    private int claroInternational;
    private int claroPackage;

    private int movistarInternational;
    private int movistarPackage;


    public Phones(int movistar, int tigo, int claro, int tigoInternational, int tigoPackage, int claroInternational, int claroPackage, int movistarInternational, int movistarPackage) {
        this.movistar = movistar;
        this.tigo = tigo;
        this.claro = claro;
        this.tigoInternational = tigoInternational;
        this.tigoPackage = tigoPackage;
        this.claroInternational = claroInternational;
        this.claroPackage = claroPackage;
        this.movistarInternational = movistarInternational;
        this.movistarPackage = movistarPackage;
    }



    public int getMovistar() {
        return movistar;
    }

    public void setMovistar(int movistar) {
        this.movistar = movistar;
    }

    public int getTigo() {
        return tigo;
    }

    public void setTigo(int tigo) {
        this.tigo = tigo;
    }

    public int getClaro() {
        return claro;
    }

    public void setClaro(int claro) {
        this.claro = claro;
    }

    public int getTigoInternational() {
        return tigoInternational;
    }

    public void setTigoInternational(int tigoInternational) {
        this.tigoInternational = tigoInternational;
    }

    public int getTigoPackage() {
        return tigoPackage;
    }

    public void setTigoPackage(int tigoPackage) {
        this.tigoPackage = tigoPackage;
    }

    public int getClaroInternational() {
        return claroInternational;
    }

    public void setClaroInternational(int claroInternational) {
        this.claroInternational = claroInternational;
    }

    public int getClaroPackage() {
        return claroPackage;
    }

    public void setClaroPackage(int claroPackage) {
        this.claroPackage = claroPackage;
    }

    public int getMovistarInternational() {
        return movistarInternational;
    }

    public void setMovistarInternational(int movistarInternational) {
        this.movistarInternational = movistarInternational;
    }

    public int getMovistarPackage() {
        return movistarPackage;
    }

    public void setMovistarPackage(int movistarPackage) {
        this.movistarPackage = movistarPackage;
    }


    public void menu() {
        int decision1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Welcome to the service operator \n " +
                "What is your service? \n 1. Tigo \n 2. Claro \n 3. Movistar \n "));


        switch (decision1) {
            case 1:
                int decisionCase1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Choose one opcion: \n 1. Minute international \n 2. Package"));
                switch (decisionCase1) {
                    case 1:
                        int num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"How many international minutes do you want?"));
                        JOptionPane.showMessageDialog(null,"The total pay for " + num1 + " minutes is " + num1*getTigoInternational() + " dollars");
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null,"The total pay for a package tigo is " + getTigoPackage() + " dollars");
                        break;
                }
                break;
            case 2:
                int decisionCase2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Choose one opcion: \n 1. Minute international \n 2. Package"));
                switch (decisionCase2) {
                    case 1:
                        int num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"How many international minutes do you want?"));
                        JOptionPane.showMessageDialog(null,"The total pay for " + num1 + " minutes is " + num1*getClaroInternational() + " dollars");
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null,"The total pay for a package claro is " + getClaroPackage() + " dollars");
                        break;
                }
                break;
            case 3:
                int decisionCase3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Choose one opcion: \n 1. Minute international \n 2. Package"));
                switch (decisionCase3) {
                    case 1:
                        int num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"How many international minutes do you want?"));
                        JOptionPane.showMessageDialog(null,"The total pay for " + num1 + " minutes is " + num1*getMovistarInternational() + " dollars");
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null,"The total pay for a package movistar is " + getMovistarPackage() + " dollars");
                        break;
                }
                break;
            default: JOptionPane.showMessageDialog(null, "Invalid choice");
            break;
        }
    }
}
