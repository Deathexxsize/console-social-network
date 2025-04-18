package org.example;

import org.example.Exception.InvalidDataInputException;
import org.example.infrastructure.ColorDemo;

import java.util.Scanner;

import static org.example.infrastructure.ColorDemo.RESET;
import static org.example.infrastructure.ColorDemo.YELLOW;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n\n== Console social media ==\n");

        System.out.println(YELLOW + "1: " + RESET + "Регистрация\n" + YELLOW + "2" + RESET + ": Вход в аккаунт");

        System.out.print("Выбрать: ");
        int choose = scanner.nextInt();

        switch (choose) {
            case 1:
                // register user
                break;
            case 2:
                // sign in
                break;
            default:
                throw new InvalidDataInputException("Не верное значение");
        }
    }
}