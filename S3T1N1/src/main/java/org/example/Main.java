package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String userLine = "";

        while (!userLine.equalsIgnoreCase("exit")) {
            System.out.println("Introduzca una comanda\nPara salir introduzca 'Exit'\n" + "Para ver historial de comandas introduzca 'History'");
            System.out.println("Para eliminar una comanda del historial introduzca 'Delete' + número de comanda");

            userLine = scanner.nextLine();
            Undo.getInstance().writeCommand(userLine);

            if (userLine.equalsIgnoreCase("History")) {
                Undo.getInstance().showCommands();
            }

            if (userLine.toLowerCase().startsWith("delete")) {
                Undo.getInstance().deleteCommand(userLine);
            }
        }
    }
}