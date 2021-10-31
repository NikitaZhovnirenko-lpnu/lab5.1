package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        System.out.println("Уведіть дійсні S та T: ");
        double s = sc.nextDouble();
        double t = sc.nextDouble();

        double x = (Math.pow(h(s, t), 4) + h(1, Math.pow(s, 2) + Math.pow(t, 2))) + Math.pow(h(s * t, 1), 2);

        System.out.println("x = " + x);
    }

    public static double h(double a, double b)
    {

        return a/(Math.pow(b, 2) + 1) + 1 / (Math.pow(a, 2) + Math.pow(b, 2));

    }
}
