package Ejercicio5;

public class AreaRectangulo {
    public int base;
    public int height;

    public void checkdetails(){
        if(base <= 0 || height <= 0) System.out.println( "You cant enter values less than 0");
    }
    public void calculateArea(){
        System.out.println("The area is: "+ base*height);
    }
}
