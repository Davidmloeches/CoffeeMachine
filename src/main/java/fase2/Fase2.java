package fase2;

import java.util.Scanner;

public class Fase2 {
    public static void main(String[] args) {
        ingredientes();
    }
    public static void ingredientes(){
        Scanner sc = new Scanner(System.in);
        // final es para cuando no se puede mover
        //contantes
        final int agua = 200;
        final int leche = 50;
        final int granosCafe = 15;

        System.out.println("Escribe cuántas tazas de café vas a necesitar:");
        int numCafe = sc.nextInt();

        System.out.println("Para"+ numCafe +"tazas de café necesitas:");
        System.out.println(numCafe * agua +"ml de agua");
        System.out.println(numCafe * leche +"ml de leche");
        System.out.println(numCafe * granosCafe +"g de cafe");
    }
}

