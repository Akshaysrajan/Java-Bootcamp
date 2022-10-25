package Assignment_2;

import java.util.Scanner;

public class rectangle_area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Length : ");
        int len = input.nextInt();
        System.out.println("Breadth : ");
        int br = input.nextInt();

        System.out.println("Area of Rectangle = "+len*br);
    }
}
