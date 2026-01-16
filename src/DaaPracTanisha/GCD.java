package DaaPracTanisha;

import java.util.Scanner;

public class GCD {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

    System.out.print("Enter first number: ");
    int num1 = input.nextInt();

    System.out.print("Enter second number: ");
    int num2 = input.nextInt();

    int gcd = findGCD(num1, num2);
    System.out.println("Greatest Common Divisor: " + gcd);
}

public static int findGCD(int a, int b) {
    if (b == 0) {
        return a;
    } else {
        return findGCD(b, a % b);
    }
}
}