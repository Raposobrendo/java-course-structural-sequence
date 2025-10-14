package Exercises;

import java.util.Locale;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double a, b, c;

        System.out.println("Digit 3 numbers who will be designated to values a, b and c:");
        System.out.print("A: ");
        a = sc.nextDouble();
        System.out.print("B: ");
        b = sc.nextDouble();
        System.out.print("C: ");
        c = sc.nextDouble();

        double triangle, circle, trapeze, square, rectangle;

        triangle = a * c / 2;
        circle = 3.141559 * Math.pow(c, 2);
        trapeze = ((a + b) * c)/2;
        square = Math.pow(b, 2);
        rectangle = a * b;

        System.out.printf("1) Triangle area: base = A, height = C: %.3f\n", triangle);
        System.out.printf("2) Circle: radius = C: %.3f\n", circle);
        System.out.printf("3) Trapeze: bases = A and B, height = C: %.3f\n", trapeze);
        System.out.printf("4) Square: side = B: %.3f\n", square);
        System.out.printf("5) Rectangle: side = A and B: %.3f\n", rectangle);

    }
}
