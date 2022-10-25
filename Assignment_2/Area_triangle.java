package Assignment_2;

import java.util.Scanner;

public class Area_triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Base of Triangle:");
        float base = input.nextFloat();
        System.out.println("Enter Height of Triangle:");
        float height = input.nextFloat();

        System.out.println("Area of the Triangle = "+ 0.5*(base*height));
    }
}
