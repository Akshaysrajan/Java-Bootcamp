package Assignment_2;

import java.util.Scanner;

public class volCyclinder {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter the radius : ");
        int r = input.nextInt();
        System.out.println("enter the height : ");
        int h = input.nextInt();

        double pi = 3.14;

        double volume = pi*r*r*h;
        System.out.printf("Volume of the cylinder = "+volume);

    }
}
