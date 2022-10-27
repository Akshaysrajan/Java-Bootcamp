package Assignment_2;

import java.util.Scanner;

public class equilateralTriangle {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Enter the Side of Triangle:");
            double side = input.nextFloat();
            double area = (side*side)*1.732/4;
            System.out.println("Area of the Triangle = "+ area);
        }
    }


