package Ejercicio5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AreaRectangulo area = new AreaRectangulo();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base of the rectangle: ");
        area.base = sc.nextInt();
        System.out.print("Enter the height of the rectangle: ");
        area.height = sc.nextInt();

        area.checkdetails();
        area.calculateArea();
    }
}
