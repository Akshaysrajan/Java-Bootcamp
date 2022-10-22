package Assignment_1;

import java.util.Scanner;

public class basic_calculator {

//    Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter 1st number :");
        int num1 = input.nextInt();

        System.out.println("Enter 2nd number : ");
        int num2 = input.nextInt();

        System.out.println("Choose operator ( +, -, *, / )");
        char operator = input.next().charAt(0);


        int sum = 0;

        if (operator == '+'){
          sum = num1 + num2;
        } else if (operator == '-') {
            sum = num1 - num2;
        } else if (operator == '*') {
              sum = num1*num2;
        } else {
            sum = num1/num2;
        }

        System.out.println("Sum : "+sum);

    }
}
