package Assignment_2;

import java.util.Scanner;

public class TotalSurfaceAreaCube {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the side : ");
        int side = input.nextInt();
        System.out.println("Total Surface area of the cube = "+6*side*side);

    }
}
