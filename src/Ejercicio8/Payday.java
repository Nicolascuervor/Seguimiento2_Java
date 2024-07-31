package Ejercicio8;

import javax.swing.*;

public class Payday {
    private String NameEmploye;

    public int hoursWork;


    public Payday(String nameEmploye, int hoursWork) {
        NameEmploye = nameEmploye;
        this.hoursWork = hoursWork;
    }

    public String getNameEmploye() {
        return NameEmploye;
    }

    public void setNameEmploye(String nameEmploye) {
        NameEmploye = nameEmploye;
    }


    public void message(){
        JOptionPane.showMessageDialog(null, "Mr " + getNameEmploye() + " for working " + hoursWork + " hours, your pay is: " + ((hoursWork <= 10)?" 30000 dollars":" 33000 dollars"));
    }
}
