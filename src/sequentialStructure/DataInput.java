package sequentialStructure;

import java.util.Scanner;

public class DataInput {
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);

        int x;
        String s1, s2, s3;

        x = sc.nextInt();
        sc.nextLine();
        // sc.nextLine(); is needed here because the next command (s1 = sc.nextLine();) catches the "Enter" we pressed when we give the x a value, making the s1 having a null string.
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("Data Input: ");
        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);


        sc.close();
    }
}
