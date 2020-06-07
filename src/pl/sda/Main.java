package pl.sda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Podaj imie");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
    }

    private static void printName(String name) {
        System.out.println("Twoje imie to " + name);
    }
}
