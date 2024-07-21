package Ejercicio9;

public class Norp {
    private int num;


    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String determine(){
        return (getNum() == 0) ? "The number 0 is neutral" : (getNum() < 0) ? "The number " + getNum() + " is negative" : "The number " + getNum() + " is positive";
    }
}
