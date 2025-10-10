package sequentialStructure;

import java.util.Locale;
import java.util.Scanner;

public class FirstCode {
    public static void main(String[] Args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Hello, my name is Brendo!");
        System.out.println(" Nice to meet you!");
        System.out.print("Guess my age: ");
        int age = sc.nextInt();
        int trueAge = 33;
        if (age == trueAge) {
            System.out.println("Guessed it RIGHT!!!!");
        } else {
            System.out.printf("Nope, i have %d years old!", trueAge);
        }

        double pi = 3.14159265359;
        System.out.printf("\nDid you know that pi equals to %.2f?", pi);
        System.out.println("...");
        System.out.print("What's your name? ");
        String name = sc.next();
        System.out.printf("Hello %s! I make 10,000 reais, how about you? Are you male or female?\n", name);
        System.out.print("Salary: ");
        Double salary = sc.nextDouble();
        System.out.print("Gender (m/f): ");
        char gender = sc.next().charAt(0);
        if (gender != 'm' && gender != 'M') {
            if (gender == 'f' || gender == 'F') {
                System.out.printf("Nice salary of R$%.2f, lady!", salary);
            }
        } else {
            System.out.printf("Nice salary of R$%.2f, dude!", salary);
        }

        sc.close();
    }
}