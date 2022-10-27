package Assignment_2;

import java.util.Scanner;

public class perimeterCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float pi = 3.14f;

        System.out.println("Enter Radius of circle :");
        float radius = input.nextFloat();
        System.out.println("Perimeter = " + pi * (radius * 2));

    }
}