package Ejercicio14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your gender (female or male): ");
        String parameterGender = sc.nextLine();
        System.out.print("Enter your age: ");
        int parameterAge = sc.nextInt();



        Help help = new Help(parameterGender,parameterAge);


        System.out.println(help.pay());
    }
}
