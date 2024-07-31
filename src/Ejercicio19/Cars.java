package Ejercicio19;

import javax.swing.*;

public class Cars {
    public void menuCar(){
        int decision1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Welcome to the CarsMaintenance center \n " +
                "What is the model number of your car? \n "));



        switch (decision1){
            case  119:  JOptionPane.showMessageDialog(null,"The car is defective; take it to the warranty service.");
                break;
            case 179: JOptionPane.showMessageDialog(null,"The car is defective; take it to the warranty service.");
                break;
            case 189: JOptionPane.showMessageDialog(null,"The car is defective; take it to the warranty service.");
                break;
            case 195: JOptionPane.showMessageDialog(null,"The car is defective; take it to the warranty service.");
                break;
            case 221: JOptionPane.showMessageDialog(null,"The car is defective; take it to the warranty service.");
                break;
            case 780: JOptionPane.showMessageDialog(null,"The car is defective; take it to the warranty service.");
                break;
            default: JOptionPane.showMessageDialog(null,"Your car is not defective.");
                break;
        }
}
}
