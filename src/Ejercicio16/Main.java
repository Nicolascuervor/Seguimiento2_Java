package Ejercicio16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the angle one: ");
        triangle.setNum1(sc.nextInt());
        System.out.print("Enter the angle two: ");
        triangle.setNum2(sc.nextInt());
        System.out.print("Enter the angle tree: ");
        triangle.setNum3(sc.nextInt());

        System.out.println(triangle.determine());
    }
}
