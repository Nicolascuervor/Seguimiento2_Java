package Ejercicio6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Send s = new Send();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your id: ");
        s.idCustomer = sc.nextInt();

        System.out.print("Enter the number guide of your package: ");
        s.numguide = sc.nextInt();

        System.out.print("Choose the type of package(basic,reinforcement,fragile): ");
        s.setTypepackaging(sc.next());

        System.out.print("Enter the date for your send: ");
        s.setDate(sc.next());

        System.out.print("Enter the weight of your send: ");
        s.setWeigth(sc.nextInt());

        System.out.print("Enter the city origin of your send: ");
        s.setCityOrigin(sc.next());

        System.out.print("Enter the destination city for your send: ");
        s.setDestinetionCity(sc.next());

        s.calculateCost();
        s.checksend();
    }

}
