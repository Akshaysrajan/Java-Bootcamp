package Assignment_1;

import java.util.Scanner;

public class simple_Interest {
//    Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Principal Amount : ");
        float principal = input.nextFloat();

        System.out.print("Enter Rate of interest : ");
        float rate = input.nextFloat();

        System.out.print("Enter Time of period(Year) : ");
        float time = input.nextFloat();

//        Calculation

        rate = rate/100 ;
//        Actual amount formula
       float SI = principal * (1 + (rate*time));

//       simple interest formula
       float interest = principal*rate*time;

//       Type conversion float -> int
       int a = (int)(SI);

//        Result
        System.out.println("Total Interest = "+ interest);
        System.out.println("Total Amount = "+ a);




    }
}
