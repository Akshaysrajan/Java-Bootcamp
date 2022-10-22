package Assignment_1;

import java.util.Scanner;
import java.lang.Math;

public class USD_Currency {
    public static void main(String[] args){
//        Input currency in rupees and output in USD.

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your indian currency : ");
        float rupee = input.nextFloat();

        System.out.println("USD = "+ Math.round(rupee/82.54)); //according to the value of 1 USD on 22-10-2022

    }
}
