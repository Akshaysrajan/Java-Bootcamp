package Assignment_2;

import java.util.Scanner;

public class volPyramid {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the base length , base width and pyramid height : ");
        float l = input.nextFloat();
        float w = input.nextFloat();
        float h = input.nextFloat();

        float volume = (l*w*h)/3;
        System.out.println("Volume of sphere = "+volume);

    }
}