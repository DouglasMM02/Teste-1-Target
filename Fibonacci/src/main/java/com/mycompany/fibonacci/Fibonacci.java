package com.mycompany.fibonacci;
import java.util.Scanner;

public class Fibonacci {

    public static boolean isFibonacci(int number) {
        if (number < 0) {
            return false;
        }

        int a = 0, b = 1;
        
        if (number == a || number == b) {
            return true;
        }

        int next = a + b;
        while (next <= number) {
            if (next == number) {
                return true;
            }
            a = b;
            b = next;
            next = a + b;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um numero: ");
        int number = scanner.nextInt();

        if (isFibonacci(number)) {
            System.out.println("O numero " + number + " pertence a sequência de Fibonacci.");
        } else {
            System.out.println("O numero " + number + " NAO pertence a sequência de Fibonacci.");
        }

        scanner.close();
    }
}

