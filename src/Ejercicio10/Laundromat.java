package Ejercicio10;

import javax.swing.*;

public class Laundromat {
    private int valueBig;
    private int valueSmall;

    public Laundromat(int valueBig, int valueSmall) {
        this.valueBig = valueBig;
        this.valueSmall = valueSmall;
    }

    public int getValueBig() {
        return valueBig;
    }

    public void setValueBig(int valueBig) {
        this.valueBig = valueBig;
    }


    public int getValueSmall() {
        return valueSmall;
    }

    public void setValueSmall(int valueSmall) {
        this.valueSmall = valueSmall;
    }

    public void menu(){
         int decision = Integer.parseInt(JOptionPane.showInputDialog(null,"Welcome, enter a number for determine the price of your rent: \n 1. Big washing machine \n 2. Small washing machine \n 3. Extit"));
         switch (decision){
             case 1:
                 int quantity1 = Integer.parseInt(JOptionPane.showInputDialog(null,"How many big washing machine do you want rent? "));
                 if(quantity1 < 3) JOptionPane.showMessageDialog(null,"The price for rent " + quantity1 + " big washing machine is " + valueBig*quantity1 + " dollars");
                 if(quantity1 > 3) JOptionPane.showMessageDialog(null,"The price for rent " + quantity1 + " big washing machine is " + (((getValueBig()*quantity1)-(getValueBig()*quantity1)*0.03)) + " dollars");
                 break;
             case 2: int quantity2 = Integer.parseInt(JOptionPane.showInputDialog(null,"How many small washing machine do you want rent? "));
                 if(quantity2 < 3) JOptionPane.showMessageDialog(null,"The price for rent " + quantity2 + " small washing machine is " + getValueSmall()*quantity2 + " dollars");
                 if(quantity2 > 3) JOptionPane.showMessageDialog(null,"The price for rent " + quantity2 + " small washing machine is " + (((getValueSmall()*quantity2)-(getValueSmall()*quantity2)*0.03)) + " dollars");
                 break;

             case 3: break;

             default: JOptionPane.showMessageDialog(null,"Invalid choice");

         }


    }



}
