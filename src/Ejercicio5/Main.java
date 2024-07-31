package Ejercicio5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base of the rectangle: ");
        int parameter1 = Integer.parseInt(sc.nextLine());
        System.out.print("Enter the height of the rectangle: ");
        int parameter2 =  Integer.parseInt(sc.nextLine());

        AreaRectangulo area = new AreaRectangulo(parameter1,parameter2);


        area.checkdetails();
        area.calculateArea();
    }
}
