package Assignment_2;

import java.util.Scanner;

public class volPrism {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Base : ");
        int b = input.nextInt();
        System.out.println("Height : ");
        int h = input.nextInt();
        System.out.println("Volume of prism = "+(h*b));
    }
}
