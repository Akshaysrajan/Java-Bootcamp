package Assignment_2;

import java.util.Scanner;

public class periRect {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("length : ");
        int l = input.nextInt();
        System.out.println("breadth : ");
        int b = input.nextInt();
        System.out.println("Perimeter of Rectangle = "+2*(l+b));
    }
}
