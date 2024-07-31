package Ejercicio11;

public class Ed {
    public int num;

    public Ed(int num) {
        this.num = num;
    }

    public String determine(){
        return (num == 0) ? "The number 0 es neutral" : (num%2 == 0) ? "The number " + num + " is even" : "The number " + num + " is odd";
    }
}
