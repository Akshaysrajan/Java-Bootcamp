package Assignment_2;

import java.util.Scanner;

public class ParallelogramArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("base : ");
        int b = input.nextInt();
        System.out.println("height : ");
        int h = input.nextInt();
        System.out.println("Area of parallelogram = "+b*h);
    }
}
