package pl.sda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //TODO: gitflow
        System.out.println("Podaj imie");
        System.out.println("aaaa");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        printName(name);
    }

    private static void printName(String name) {
        System.out.println("Twoje imie to " + name);
    }
}
