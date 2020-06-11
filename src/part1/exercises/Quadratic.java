package part1.exercises;

import java.util.Scanner;

/**
 * Вычисление корней квадратного уравнения
 * x^2 + b*x + c
 */
public class Quadratic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите коэффициенты");
        double b = in.nextDouble();
        double c = in.nextDouble();
        double discriminant = b * b - 4.0 * c;
        double d = Math.sqrt(discriminant);
        System.out.println((-b + d) / 2);
        System.out.println((-b - d) / 2);
    }
}
