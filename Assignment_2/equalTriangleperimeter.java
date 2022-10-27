package Assignment_2;

import java.util.Scanner;

public class equalTriangleperimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Side of Triangle :");
        float radius = input.nextFloat();
        System.out.println("Perimeter = " +  (3*radius));

    }
}