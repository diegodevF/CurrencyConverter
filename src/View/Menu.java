package View;

import Controller.Request;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("___________________________________");
            System.out.println("Currency Converter By DevDiego     ");
            System.out.println("Monedas Disponibles para conversion");
            System.out.println("        1.USD  2.EUR  3.COP        ");
            System.out.println("___________________________________");

            System.out.println("Digita el nombre de la primera moneda");
            String valueOne = sc.nextLine();

            System.out.println("Digita el nombre de la segunda moneda");
            String valueTwo = sc.nextLine();

            System.out.println("Digite el valor a convertir: $");
            double valueToConverter = sc.nextDouble();

//            System.out.println("xd" + valueOne.toUpperCase() + valueTwo.toUpperCase() + valueToConverter);

            System.out.println(Request.requesToAPI(valueOne.toUpperCase(), valueTwo.toUpperCase(), valueToConverter));


        }catch (Exception e){
            System.out.println("Valor ingresado no es valido: " + e.getMessage());
        }


    }
}
