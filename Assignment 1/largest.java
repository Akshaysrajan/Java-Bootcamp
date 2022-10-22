package Assignment_1;

import java.util.Scanner;

public class largest {
//    Take 2 numbers as input and print the largest number.

    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Enter two number : ");
    int num1 = input.nextInt();
    int num2 = input.nextInt();

    if (num1 > num2){
        System.out.println(num1+" is largest number!!");
    }else {
        System.out.println(num2+" is the largest number!!");
    }

    }
}
