package part1.exercises;

import java.util.Scanner;

/*
Программа вычисляет является ли год високосным
 */
public class LeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        boolean isLeapYear = (year % 4) == 0;
        isLeapYear = isLeapYear && ((year % 100) != 0);
        isLeapYear = isLeapYear || ((year % 400) == 0);
        System.out.println(isLeapYear);
    }
}
