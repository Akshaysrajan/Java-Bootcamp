package Assignment_1;

import java.util.Scanner;

public class greeting {
//   Take name as input and print a greeting message for that particular name.
    public static void main(String[] args){
        System.out.println("Enter your name: ");
        Scanner input = new Scanner(System.in);

        String name = input.nextLine();
        System.out.println("Happy Birthday "+ name +"!!!");

    }
}
