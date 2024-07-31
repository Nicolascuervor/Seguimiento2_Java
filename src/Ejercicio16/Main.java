package Ejercicio16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the angle one: ");
        int parameternum1 = sc.nextInt();
        System.out.print("Enter the angle two: ");
        int parameternum2 = sc.nextInt();
        System.out.print("Enter the angle tree: ");
        int parameternum3 = sc.nextInt();


        Triangle triangle = new Triangle(parameternum1, parameternum2, parameternum3);



        System.out.println(triangle.determine());
    }
}
