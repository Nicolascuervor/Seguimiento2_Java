package Ejercicio13;

public class Numbers {
    public int num1;
    public int num2;
    public int num3;

    public String determine(){
        return (num1 > num2 && num1 > num3) ?
                "The number " + num1 + " is the largest among the 3 numbers" : (num2 > num1 && num2 > num3) ?
                    "The number " + num2 + " is the largest among the 3 numbers" : (num3 > num2 && num3 > num1) ?
                        "The number " + num3 + " is the largest among the 3 numbers" : "The tree or two numbers are equals";
    }


}
