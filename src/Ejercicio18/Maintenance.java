package Ejercicio18;

import javax.swing.*;

public class Maintenance {
    public void menu(){
        int decision1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Welcome to the maintenance center \n " +
                "How we can help you today? \n " +
                    "1. My PC makes a sound when it starts up, and the hard drive spins. \n " +
                        "2. My PC makes a sound when it starts up, and the drive spins. \n " +
                            "3. My PC makes a sound when it starts up, but the drive doesn't spins. \n " +
                                "4. My PC does not make a sound when it starts up, and the hard drive does not spin. \n " +
                                    "5. My PC does not make a sound when it starts up, but the hard drive spins."));


        switch (decision1){
            case 1:  JOptionPane.showMessageDialog(null,"It is malfunctioning");
            break;
            case 2: JOptionPane.showMessageDialog(null,"Contact technical support.");
            break;
            case 3: JOptionPane.showMessageDialog(null,"Check the unit's connections.");
            break;
            case 4: JOptionPane.showMessageDialog(null,"Bring the computer to the central office for repair.");
            break;
            case 5: JOptionPane.showMessageDialog(null,"Check the speaker connections");
            break;
            default: JOptionPane.showMessageDialog(null,"Sorry we cant help you with your problem");
            break;
        }

    }

}
