package Assignment_2;

import java.util.Scanner;

public class periPara {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Base : ");
        int b = input.nextInt();
        System.out.println("Side : ");
        int a = input.nextInt();
        System.out.println("Perimeter of parallelogram = "+2*(a+b));
    }
}
