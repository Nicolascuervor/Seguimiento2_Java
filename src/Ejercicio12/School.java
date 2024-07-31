package Ejercicio12;

import javax.swing.*;

public class School {
    private int physic;
    private int chemistry;
    private int biology;
    private int math;
    private int informatic;


    public School(int physic, int chemistry, int biology, int math, int informatic) {
        this.physic = physic;
        this.chemistry = chemistry;
        this.biology = biology;
        this.math = math;
        this.informatic = informatic;
    }

    public int getPhysic() {
        return physic;
    }

    public void setPhysic(int physic) {
        this.physic = physic;
    }

    public int getChemistry() {
        return chemistry;
    }

    public void setChemistry(int chemistry) {
        this.chemistry = chemistry;
    }

    public int getBiology() {
        return biology;
    }

    public void setBiology(int biology) {
        this.biology = biology;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getInformatic() {
        return informatic;
    }

    public void setInformatic(int informatic) {
        this.informatic = informatic;
    }

    public void prom(){
        int result = (getPhysic() + getBiology() + getMath() + getInformatic() + getChemistry())/5;
        if(result <= 5.999){
            JOptionPane.showMessageDialog(null,"You have a terrible average in: " + result);
        }
        if(result >= 6 && result < 8){
            JOptionPane.showMessageDialog(null,"You have a god average in: " + result);
        }
        if(result >= 8){
            JOptionPane.showMessageDialog(null,"You have a execelent average in: " + result);
        }

    }

}
