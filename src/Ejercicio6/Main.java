package Ejercicio6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your id: ");
        int idCustomer = sc.nextInt();

        System.out.print("Enter the number guide of your package: ");
        int numguide = sc.nextInt();

        System.out.print("Choose the type of package(basic,reinforcement,fragile): ");
        String setTypepackaging = sc.nextLine();

        System.out.print("Enter the date for your send: ");
        String setDate = sc.nextLine();

        System.out.print("Enter the weight of your send: ");
        int setWeigth = sc.nextInt();

        System.out.print("Enter the city origin of your send: ");
        String setCityOrigin = sc.nextLine();

        System.out.print("Enter the destination city for your send: ");
        String setDestinetionCity = sc.nextLine();



        Send s = new Send(numguide,setDate,setTypepackaging,idCustomer,setWeigth,setCityOrigin,setDestinetionCity,5000,"Avalible");


        s.calculateCost();
        s.checksend();
    }

}
