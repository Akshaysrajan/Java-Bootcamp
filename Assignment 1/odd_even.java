package Assignment_1;

import java.util.Scanner;

public class odd_even {
    public static void main(String[] args) {

    //Write a program to print whether a number is even or odd, also take input from the user.

        System.out.println("Enter a number : ");
        Scanner input = new Scanner(System.in);
        int Num = input.nextInt();

        // checking thw number
        if (Num % 2 == 0){
            System.out.print(Num + " is an even number !!");
        }else System.out.print(Num + " is a odd number !!");
    }
}
