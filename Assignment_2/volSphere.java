package Assignment_2;

import java.util.Scanner;

public class volSphere {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius : ");
        float r = input.nextFloat();
        float pi = 3.14f;
        float volume = (pi*r*r*r*4)/3;
        System.out.println("Volume of sphere = "+volume);

    }
}
