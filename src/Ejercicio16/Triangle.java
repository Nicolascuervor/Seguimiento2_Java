package Ejercicio16;

public class Triangle {
    private int num1;
    private int num2;
    private int num3;

    public Triangle(int num1, int num2, int num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public String determine(){
        int conclution = getNum1() + getNum2() + getNum3();

        return (conclution == 180) ? "It's a triangle" : "it is not a triangle";
    }


    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum3() {
        return num3;
    }

    public void setNum3(int num3) {
        this.num3 = num3;
    }
}
