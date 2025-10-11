package sequentialStructure;

import java.util.Scanner;

public class BasicMath {
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);

        int y;
        double x;

        System.out.print("Choose a value to x: ");
        x = sc.nextDouble();

        System.out.printf("x: %.2f\n", x);
        System.out.printf("Square root of X: %.2f\n", Math.sqrt(x));
        System.out.print("Choose the value of y to make x to the power of y: ");
        y = sc.nextInt();
        System.out.printf("x to the power of y: %.2f\n", Math.pow(x, y));
        System.out.printf("Absolute value of x (always turn negative values to positive): %.2f", Math.abs(x));

        sc.close();
    }
}
